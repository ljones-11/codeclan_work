import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;

    private RoomType roomType;

    private int nightlyRate;

    public Bedroom(int capacity, int roomNumber, RoomType roomType, int nightlyRate, boolean isBooked) {
        super(capacity, isBooked);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(int nightlyRate) {
        this.nightlyRate = nightlyRate;
    }
}
