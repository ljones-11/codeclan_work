import java.util.ArrayList;

public class FlightManager {

    Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    double getPassengerAllowance(){
        return (this.flight.getPlane().getPlaneType().getReservedBaggageWeight()
                /
                this.flight.getPlane().getPlaneType().getCapacity());
}

    public double getBaggageBooked() {
        return (this.getPassengerAllowance()
                *
                this.flight.getPassengers().size());
    }

    public double getRemainingBaggageWeight() {
        return this.flight.getPlane().getPlaneType().getReservedBaggageWeight()
                -
                this.getBaggageBooked();
    }
}
