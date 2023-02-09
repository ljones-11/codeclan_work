import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Bedroom bedroom;
    Guest guest1;

    @Before
    public void setup(){
        bedroom = new Bedroom(2, 11, RoomType.DOUBLE, 700, false);
        guest1 = new Guest("Kyle");
    }

    @Test
    public void canAddGuestToRoom(){
        bedroom.addGuestToRoom(guest1);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        bedroom.addGuestToRoom(guest1);
        bedroom.removeGuestFromRoom(guest1);
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void roomHasBookedStatus(){
        assertEquals(false, bedroom.getBooked());
    }



    @Test
    public void canCalculateRoomArea(){
        double length = 10;
        double width = 2;
        assertEquals(20, Room.calculateRoomArea(length, width), 0);
    }
}
