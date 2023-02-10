import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Pilot pilot1;

    private Plane plane1;

    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;

    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;




    @Before
    public void setup(){
        pilot1 = new Pilot("Bryan", Rank.FIRST_OFFICER, "license123");
        plane1 = new Plane(PlaneType.BOEING747);
        flight = new Flight(pilot1, cabinCrewMembers, passengers, plane1,"ABC123", "GLA", "CDG","0600");
        cabinCrewMember1 = new CabinCrewMember("Steve", Rank.FIRST_OFFICER);
        cabinCrewMember2 = new CabinCrewMember("Ben", Rank.PURSER);
        cabinCrewMember3 = new CabinCrewMember("Ash", Rank.FLIGHT_ATTENDANT);


    }

    @Test
    public void flightHasPilot(){
        assertEquals("Bryan", flight.getPilot().getName());
    }
    @Test
    public void flightHasListOfCabinCrew(){
        assertEquals(cabinCrewMembers, flight.getCabinCrewMembers());
    }
    @Test
    public void flightHasListOfPassengers(){
        assertEquals(0, flight.getPassengers().size());
    }
    @Test
    public void flightHasPlane(){
        assertEquals(PlaneType.BOEING747, flight.getPlane().getPlaneType());
    }
    @Test
    public void flightHasFlightNumber(){
        assertEquals("ABC123", flight.getFlightNumber());
    }
    @Test
    public void flightHasDestination(){
        assertEquals("GLA", flight.getDestination());
    }
    @Test
    public void flightHasDepartureAirport(){
        assertEquals("CDG", flight.getDepartureAirport());
    }
    @Test
    public void flightHasDepartureTime(){
        assertEquals("0600", flight.getDepartureTime());
    }

    @Test
    public void cabinCrewMembersCanBeAddedToFlight(){
        flight.addCabinCrew(cabinCrewMember1);
        flight.addCabinCrew(cabinCrewMember2);
        flight.addCabinCrew(cabinCrewMember2);
        assertEquals(3, flight.getCabinCrewMembers().size());
    }
}
