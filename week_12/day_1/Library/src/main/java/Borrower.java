import java.util.ArrayList;

public class Borrower {

    private Library library;

    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public int getBookCount(){
        return this.collection.size();
    }

    public void borrowBook(Library library, Book book){
        library.removeBook(book);
        this.collection.add(book);
    }
}
