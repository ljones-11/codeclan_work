import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
    passenger = new Passenger("Ben", 1);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Ben", passenger.getName());
    }

    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }
}
