from db.run_sql import run_sql

from models.author import Author
from models.book import Book


#delete all
def delete_all():
    sql = "DELETE FROM authors"
    run_sql(sql)

#delete

def delete(id):
    sql = " DELETE FROM authors where id = %s"
    values = [id]
    run_sql(sql, values)

#save

def save(author):
    sql = "INSERT INTO authors (name) VALUES (%s) RETURNING *"
    values = [author.name]
    results = run_sql(sql, values)
    author.id = results[0]['id']
    return author

def select_all():
    authors = []

    sql = "SELECT * from authors"
    results = run_sql(sql)

    for row in results:
        author = Author(row['name'], row['id'])
        authors.append(author)
    return authors

def select(id):
    author = None
    sql = "SELECT * FROM authors WHERE id = %s"
    values = [id]
    results = run_sql(sql, values)

    if results:
        result = results[0]
        author = Author(result['name'], result['id'])
    return author

def update(author):
    sql = " UPDATE authors SET (name) = (%s) WHERE id = %s"
    values = [author.name, author.id]
    run_sql(sql, values)


