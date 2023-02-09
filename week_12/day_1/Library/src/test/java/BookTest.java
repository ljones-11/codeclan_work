import org.junit.Before;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("The Hobbit", "J.R.R Tolkein", "Fantasy");
    }
}
