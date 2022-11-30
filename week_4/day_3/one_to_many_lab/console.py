from models.author import Author
from models.book import Book

from repositories import author_repository
from repositories import book_repository

book_repository.delete_all()
author_repository.delete_all()

author1 = Author("J.R.R Tolkein")
author_repository.save(author1)
author2 = Author("Ian Rankin")
author_repository.save(author2)

book1 = Book("The Hobbit", author1, "Fantasy")
book_repository.save(book1)
book2 = Book("Black and Blue", author2, "Crime")
book_repository.save(book2)

for author in author_repository.select_all():   
    print(author.__dict__)

for book in book_repository.select_all():
    print(book.__dict__)
