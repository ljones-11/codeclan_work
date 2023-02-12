import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PassengerTest {

    Passenger passenger;
    Flight flight1;

    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;

    SimpleDateFormat sdf = new SimpleDateFormat("HHmm");

    Plane plane1;
    Pilot pilot1;


    @Before
    public void before(){
        pilot1 = new Pilot("Mr Pilot", Rank.CAPTAIN, "LICENseNo1");
        Date departureTime1;
        try {
            departureTime1 = sdf.parse("0600");
        } catch (ParseException e) {
            e.printStackTrace();
            departureTime1 = new Date();
        }
        Date departureTime2;
        try {
            departureTime2 = sdf.parse("1900");
        } catch (ParseException e) {
            e.printStackTrace();
            departureTime2 = new Date();
        }
        plane1 = new Plane(PlaneType.BOEING747);
        flight1 = new Flight(pilot1, cabinCrewMembers, passengers, plane1, "GLA123","CDG","GLA", departureTime1 );
        passenger = new Passenger("Ben", 1, null, null);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Ben", passenger.getName());
    }

    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }

    @Test
    public void passengerStartsWithoutFlight(){
        assertEquals(null, passenger.getFlight());
    }

    @Test
    public void passengerHasFlightWhenBookedOn(){
        flight1.bookPassenger(passenger);
        assertEquals(flight1, passenger.getFlight());
    }

    @Test
    public void passengerStartsWithNoSeatNumber(){
        assertEquals(null, passenger.getSeatNumber());
    }
    @Test
    public void passengerIsAssignedARandomSeatWhenBookedOnFlight(){
        flight1.bookPassenger(passenger);
        Integer randomNumber = passenger.getSeatNumber();
        assertTrue(randomNumber >=1 && randomNumber <= 416);
    }

}
