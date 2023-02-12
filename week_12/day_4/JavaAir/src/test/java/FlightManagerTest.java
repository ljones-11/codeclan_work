import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

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
    private Passenger passenger2;

    FlightManager flightManager1;
    FlightManager flightManager2;

    SimpleDateFormat sdf = new SimpleDateFormat("HHmm");




    @Before
    public void setup() {
        pilot1 = new Pilot("Bryan", Rank.FIRST_OFFICER, "license123");
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.MICROLIGHT);
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
        flight1 = new Flight(pilot1, cabinCrewMembers, passengers, plane1, "ABC123", "GLA", "CDG", departureTime1);
        flight2 = new Flight(pilot1, cabinCrewMembers, passengers, plane2, "ML123", "GLA", "GLA", departureTime2);
        cabinCrewMember1 = new CabinCrewMember("Steve", Rank.FIRST_OFFICER);
        cabinCrewMember2 = new CabinCrewMember("Ben", Rank.PURSER);
        cabinCrewMember3 = new CabinCrewMember("Ash", Rank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Dave", 1);
        passenger1 = new Passenger("Kirsty", 1);
        flightManager1 = new FlightManager(flight2);
        flightManager2 = new FlightManager(flight1);
    }

    @Test
    public void planeHasReservedBaggageAmount(){
        assertEquals(60, flight2.getPlane().getPlaneType().getReservedBaggageWeight());
    }

    @Test
    public void getPassengerWeightAllowance(){
        assertEquals(30, flightManager1.getPassengerAllowance(), 0);
    }

    @Test
    public void getBaggageWeightBooked(){
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        assertEquals(60, flightManager1.getBaggageBooked(), 0);
    }

    @Test
    public void getRemainingBaggageWeightAvailable(){
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        assertEquals(41079, flightManager2.getRemainingBaggageWeight(), 0);

    }
}
