import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    private HashMap<String, Integer> genres = new HashMap<>();

    genres.put()

    public Library(int capacity) {
        this.stock = new ArrayList<>();
        this.capacity = capacity;
        this.genres = HashMap<>();
    }

    public int getBookCount(){
        return this.stock.size();
    }


    public void addBook(Book book){
        if(this.getBookCount() == this.capacity){
        } else{
            this.stock.add(book);
        }
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void removeBook(Book book){
         this.stock.remove(book);
    }
}
