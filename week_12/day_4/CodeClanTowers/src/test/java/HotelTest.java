import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Guest guest;
    Booking booking;
    DiningRoom diningRoom;

    @Before
    public void setup() {
        hotel = new Hotel();
        bedroom1 = new Bedroom(2, 27, RoomType.DOUBLE, 700, false);
        bedroom2 = new Bedroom(1, 12, RoomType.SINGLE, 400, false);
        diningRoom = new DiningRoom("Loch Lomond", 50, false);

    }

    @Test
    public void canCreateBooking() {
        Booking booking = hotel.bookRoom(bedroom1, 4);
        assertNotNull(booking);
        assertEquals(4, booking.getNumberOfNights());
        assertEquals(true, bedroom1.getBooked());

    }

    @Test
    public void canGetNightlyRate() {
        assertEquals(700, bedroom1.getNightlyRate());
    }

    @Test
    public void canCreateTotalBill() {
        Booking booking = hotel.bookRoom(bedroom1, 2);
        assertEquals(1400, booking.calculateBill(booking));

    }

    @Test
    public void canAddDiningRoomToCollection() {
        hotel.addDiningRoomToCollection(diningRoom);
        assertEquals(1, hotel.getSizeOfDiningCollection());
    }

    @Test
    public void canGetDiningRoomByName() {
        hotel.addDiningRoomToCollection(diningRoom);
        assertEquals(diningRoom, hotel.getDiningRoomByName(diningRoom.getName()));

    }

    @Test
    public void canAddBedroomToHotel() {
        hotel.addBedroomToHotel(bedroom1);
        hotel.addBedroomToHotel(bedroom2);
        assertEquals(2, hotel.getBedrooms().size());
    }

    @Test
    public void canGetVacantBedrooms() {
        hotel.addBedroomToHotel(bedroom1);
        hotel.addBedroomToHotel(bedroom2);
        hotel.bookRoom(bedroom1, 2);
        assertEquals(1, hotel.getVacantRooms().size());

    }

    @Test
    public void bookingOnlyMadeIfBedroomVacant(){
        bedroom1 = new Bedroom(2, 27, RoomType.DOUBLE, 700, true);
        hotel.addBedroomToHotel(bedroom1);
        Booking booking = hotel.bookRoom(bedroom1, 4);
        assertNull(booking);


    }
}
