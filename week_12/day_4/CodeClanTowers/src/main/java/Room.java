import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;

    Room room;
    private boolean isBooked;

    public Room(int capacity, boolean isBooked) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.isBooked = isBooked;


    }


    public int getCapacity() {
        return capacity;
    }

    public boolean getBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addGuestToRoom(Guest guest){
        guests.add(guest);

    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public void removeGuestFromRoom(Guest guest) {
        guests.remove(guest);
    }

    public static double calculateRoomArea(double length, double width) {
        return length * width;
    }

}
