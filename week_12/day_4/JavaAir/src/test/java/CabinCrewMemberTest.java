import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrewMember("Jason", Rank.FLIGHT_ATTENDANT);
    }
    @Test
    public void pilotHasName(){
        assertEquals("Jason", cabinCrew.getName());
    }
    @Test
    public void pilotHasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrew.getRank());
    }
    @Test
    public void crewMemberCanRelayMessages(){assertEquals("Please fasten your seatbelts", cabinCrew.relayMessage());}
}
