from models.author import Author
from models.book import Book
from db.run_sql import run_sql
from repositories import author_repository

def delete_all():
    sql = "DELETE from books"
    run_sql(sql)

def delete(id):
    sql = " DELETE from books where id = %s"
    values = [id]
    run_sql(sql, values)

def save(book):
    sql = "INSERT INTO books (title, author_id, genre) VALUES (%s, %s, %s) RETURNING *"
    values = [book.title, book.author.id, book.genre]
    results = run_sql(sql, values)
    book.id = results[0]['id']
    return book

def select_all():
    books = []

    sql = "SELECT * from books"
    results = run_sql(sql)

    for row in results:
        author = author_repository.select(row['author_id'])
        book = Book(row['title'], author, row['genre'], row['id'])
        books.append(book)
    return books

def select(id):
    book = None
    sql = "SELECT from books WHERE id = %s"
    values = [id]
    result = run_sql(sql, values)

    if result is not None:
        author = author_repository.select(result['author_id'])
        book = Book(result['title'], author, result['genre'], result['id'])
    return book

def update(book):
    sql = "UPDATE books set (title, author_id, genre) = (%s, %s, %s) WHERE id = %s"
    values = [book.title, book.author.id, book.genre]
    run_sql(sql, values)
