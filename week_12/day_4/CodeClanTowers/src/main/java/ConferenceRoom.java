import java.util.ArrayList;

public class ConferenceRoom extends Room{
    private String name;

    public ConferenceRoom(int capacity, String name, boolean isBooked) {
        super(capacity, isBooked);
        this.name = name;
    }
}
