import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void setup() {
        diningRoom = new DiningRoom("Loch Lomond", 50, false);

    }

    @Test
    public void diningRoomHasCapacity(){
        assertEquals(50, diningRoom.getCapacity());
    }

}
