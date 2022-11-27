from flask import render_template, request, redirect
from models.books import book_list, get_book, add_new_book, remove_book
from models.book import Book

from app import app

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/books')
def books():
    return render_template('books.html', book_list=book_list)

@app.route('/books/<int:book_index>')
def book(book_index):
    my_book = get_book(book_index)
    return render_template('book.html', book=my_book)

@app.route('/books', methods=['POST'])
def add_book():
    title = request.form["title"]
    author = request.form["author"]
    genre = request.form["genre"]
    new_book = Book(title=title, author=author, genre=genre)
    add_new_book(new_book)
    return redirect('/books')

@app.route('/books/delete', methods=['POST'])
def delete_book():
    book_index = int(request.form["index"])
    book_to_remove = book_list[book_index]
    remove_book(book_to_remove)

    return redirect('/books')

    