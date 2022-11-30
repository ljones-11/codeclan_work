from flask import Flask, Blueprint, render_template, request
from repositories import book_repository, author_repository
from models.book import Book

book_blueprint = Blueprint("books", __name__)

@book_blueprint.route('/books')
def books():
    all_books_list = book_repository.select_all()
    return render_template('books/index.html', books = all_books_list)

#delete book POST request '/books/<id>'