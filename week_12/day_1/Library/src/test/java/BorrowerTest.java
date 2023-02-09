import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;


    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(10);
        book1 = new Book("qwer", "eeee", "Fantsasy");
    }

    @Test
    public void borrowerStartsWithNoBooks(){
        assertEquals(0, borrower.getBookCount());
    }

    @Test
    public void canBorrowBook(){
        library.addBook(book1);
        borrower.borrowBook(library, book1);
        assertEquals(1, borrower.getBookCount());
    }

}
