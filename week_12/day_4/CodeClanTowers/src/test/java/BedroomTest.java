import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void setup(){
        bedroom = new Bedroom(1,12, RoomType.DOUBLE, 700, false);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(12, bedroom.getRoomNumber());
    }

    @Test
    public void canGetBedroomArea(){
        double length = 5;
        double width = 6;
        assertEquals(30, Room.calculateRoomArea(length, width), 0);
    }
}
