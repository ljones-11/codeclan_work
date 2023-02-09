import java.util.ArrayList;

public class DiningRoom extends Room {
    private String name;

    private ArrayList<Guest> diningRoomGuests;

    public DiningRoom(String name, int capacity, boolean isBooked) {
        super(capacity, isBooked);
        this.diningRoomGuests = new ArrayList<Guest>();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Guest> getDiningRoomGuests() {
        return diningRoomGuests;
    }

    public void setDiningRoomGuests(ArrayList<Guest> diningRoomGuests) {
        this.diningRoomGuests = diningRoomGuests;
    }
}
