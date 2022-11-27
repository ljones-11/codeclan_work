from models.book import Book

#books
book1 = Book("The BFG", 'Roald Dahl', 'Childrens', True)
book2 = Book("Fantastic Mr Fox", 'Roald Dahl', 'Childrens', False)
book3 = Book("The Twits", 'Roald Dahl', 'Childrens', False)
book4 = Book("The Hobbit", 'J.R.R. Tolkien', 'Fantasy', False)
book5 = Book("The Fellowship of the Ring", 'J.R.R. Tolkien', 'Fantasy', False)
book6 = Book("The Two Towers", 'J.R.R. Tolkien', 'Fantasy', False)
book7 = Book("The Return of the King", 'J.R.R. Tolkien', 'Fantasy', False)
book8 = Book("Black and Blue", "Ian Rankin", "Crime", False)
book9 = Book("The Hanging Garden", "Ian Rankin", "Crime", False)
book10 = Book("Dead Souls", "Ian Rankin", "Crime", False)
book11 = Book("Trainspotting", "Irvine Welsh", "Dark Comedy", False)
book12 = Book("Bounce", "Matthew Syed", "Sports Psychology", False)

book_list = [book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12]

#def methods
def get_book(book_index):
    return book_list[book_index]

def add_new_book(new_book):
    book_list.append(new_book)

def remove_book(book_to_remove):
    book_list.remove(book_to_remove)
