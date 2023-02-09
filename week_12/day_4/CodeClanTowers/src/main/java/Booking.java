public class Booking {

    Bedroom bedroom;
    private int numberOfNights;

    public Booking(Bedroom bedroom, int numberOfNights) {
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;


    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public int calculateBill(Booking booking) {
        return booking.bedroom.getNightlyRate() * booking.getNumberOfNights();
    }
}
