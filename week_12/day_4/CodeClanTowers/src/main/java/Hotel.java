import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Hotel {

    Booking booking;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    private HashMap<String, DiningRoom> diningCollection;

    private ArrayList<Bedroom> vacantRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningCollection = new HashMap<String, DiningRoom>();
        this.vacantRooms = new ArrayList<Bedroom>();
    }

    public void checkInBedroomGuest(Guest guest, Bedroom bedroom){
        bedroom.addGuestToRoom(guest);
    }

    public void checkInConferenceGuest(Guest guest, ConferenceRoom conferenceRoom){
        conferenceRoom.addGuestToRoom(guest);

    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        if(bedroom.getBooked()){
            return null;
        } else {
            Booking booking = new Booking(bedroom, numberOfNights);
            booking.setBedroom(bedroom);
            booking.setNumberOfNights(numberOfNights);
            bedroom.setBooked(true);
            return booking;
        }

    }

    public void addDiningRoomToCollection(DiningRoom diningRoom){
        this.diningCollection.put(diningRoom.getName(), diningRoom);
    }

    public void addBedroomToHotel(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }


    public  int getSizeOfDiningCollection(){
        return this.diningCollection.size();

    }

    public DiningRoom getDiningRoomByName(String name) {
        return diningCollection.get(name);
    }


    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<Bedroom> getVacantRooms() {
        ArrayList<Bedroom> vacantRooms = new ArrayList<Bedroom>();
        for (Bedroom bedroom : bedrooms) {
            if(bedroom.getBooked() == false)
                vacantRooms.add(bedroom);
        }
        return vacantRooms;
    }


}
