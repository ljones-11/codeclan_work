import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight1;
    private Flight flight2;
    private Pilot pilot1;

    private Plane plane1;
    private Plane plane2;

    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;

    private CabinCrewMember cabinCrewMember1;
    private CabinCrewMember cabinCrewMember2;
    private CabinCrewMember cabinCrewMember3;

    private Passenger passenger1;




    @Before
    public void setup(){
        pilot1 = new Pilot("Bryan", Rank.FIRST_OFFICER, "license123");
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.MICROLIGHT);
        flight1 = new Flight(pilot1, cabinCrewMembers, passengers, plane1,"ABC123", "GLA", "CDG","0600");
        flight2 = new Flight(pilot1, cabinCrewMembers, passengers, plane2,"ML123", "GLA", "GLA","0700");
        cabinCrewMember1 = new CabinCrewMember("Steve", Rank.FIRST_OFFICER);
        cabinCrewMember2 = new CabinCrewMember("Ben", Rank.PURSER);
        cabinCrewMember3 = new CabinCrewMember("Ash", Rank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Dave", 1);


    }

    @Test
    public void flightHasPilot(){
        assertEquals("Bryan", flight1.getPilot().getName());
    }
    @Test
    public void flightHasListOfCabinCrew(){
        assertEquals(cabinCrewMembers, flight1.getCabinCrewMembers());
    }
    @Test
    public void flightHasListOfPassengers(){
        assertEquals(0, flight1.getPassengers().size());
    }
    @Test
    public void flightHasPlane(){
        assertEquals(PlaneType.BOEING747, flight1.getPlane().getPlaneType());
    }
    @Test
    public void flightHasFlightNumber(){
        assertEquals("ABC123", flight1.getFlightNumber());
    }
    @Test
    public void flightHasDestination(){
        assertEquals("GLA", flight1.getDestination());
    }
    @Test
    public void flightHasDepartureAirport(){
        assertEquals("CDG", flight1.getDepartureAirport());
    }
    @Test
    public void flightHasDepartureTime(){
        assertEquals("0600", flight1.getDepartureTime());
    }
    @Test
    public void cabinCrewMembersCanBeAddedToFlight(){
        flight1.addCabinCrew(cabinCrewMember1);
        flight1.addCabinCrew(cabinCrewMember2);
        flight1.addCabinCrew(cabinCrewMember2);
        assertEquals(3, flight1.getCabinCrewMembers().size());
    }
    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(416, flight1.getAvailableSeats());
    }
    @Test
    public void canBookPassengerOntoFlight2(){
        flight2.bookPassenger(passenger1);
        assertEquals(1, flight2.getAvailableSeats());
    }


}
