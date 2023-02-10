import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Bill", Rank.CAPTAIN, "LICense123");
    }
    @Test
    public void pilotHasName(){
        assertEquals("Ben", pilot.getName());
    }
    @Test
    public void pilotHasLicenseNumber(){
        assertEquals(1, pilot.getLicenseNumber());
    }
    @Test
    public void pilotHasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }
    @Test
    public void pilotCanFlyPlane(){assertEquals("Take Off!", pilot.flyPlane());}
}
