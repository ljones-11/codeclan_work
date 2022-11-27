import unittest
import models
from models.book import Book
from models.books import *

class TestBook(unittest.TestCase):

   

    def setUp(self):
        self.book1 = Book("Harry Potter and the Philosophers Stone", "J.K. Rowling", "Fantasy", True)
        self.book2 = Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", "Fantasy", False)
        self.book3 = Book("Harry Potter and the Prisoner of Askaban", "J.K. Rowling", "Fantasy", False)

    def test_book_has_title(self):
        self.assertEqual("Harry Potter and the Philosophers Stone", self.book1.title)

    def test_book_has_author(self):
        self.assertEqual("J.K. Rowling", self.book1.author)

    def test_book_has_genre(self):
        self.assertEqual("Fantasy", self.book1.genre)
        
    def test_single_book(self):
        self.books.add_new_book(self.book1)
        self.assertEqual("1", len(book_list))

    def test_book_is_has_checked_out_status(self):
        self.assertEqual(True, self.book1.checked_out)





        # def test_add_book
        # def test_remove_book