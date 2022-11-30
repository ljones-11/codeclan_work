from flask import Flask, Blueprint, render_template, request, redirect
from repositories import book_repository, author_repository
from models.book import Book

author_blueprint = Blueprint("authors", __name__)

@author_blueprint.route('/author/<int:author_id>')
def author(author_id):

    single_author = author_repository.select(author_id)
    return render_template('author.html', author = single_author)