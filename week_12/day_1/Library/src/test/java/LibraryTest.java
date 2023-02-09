import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void before(){
        book1 = new Book("The Hobbit", "J.R.R Tolkein", "Fantasy");
        book2 = new Book("LOTR 1", "J.R.R Tolkein", "Fantasy");
        book3 = new Book("LOTR 2", "J.R.R Tolkein", "Fantasy");
        book4 = new Book("LOTR 3", "J.R.R Tolkein", "Fantasy");
        book5 = new Book("Trainspotting", "Irvine Welsh", "Dark Humour");
        library = new Library(6);

    }

    @Test
    public void bookCountStartsAtZero(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void libraryCanAddBooks(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(6, library.getCapacity());
    }

    @Test
    public void libraryIsFull(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(6, library.getBookCount());
    }

    @Test
    public void bookCanBeRemoved(){
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book1);
        assertEquals(1, library.getBookCount());



    }


}
