import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Test
    public void canGetConferenceRoomArea(){
        assertEquals(40, Room.calculateRoomArea(10, 4), 0);
    }
}
