import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;

    @Before
    public void before() {
        car = new Car("Ford", "Escort");
    }

    @Test
    public void hasMake() {
        assertEquals("Ford", car.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Escort", car.getModel());
    }

    @Test
    public void odomoterReadingStartsAtZero() {
        assertEquals(0, car.getOdometerReading());
    }

    @Test
    public void carCanMove(){
        car.move(10);
        assertEquals(10, car.getOdometerReading());
    }

    @Test
    public void carCanStart(){
        assertEquals("Car started", car.start());
    }
    @Test
    public void carCanStop(){
        assertEquals("Car stopped", car.stop());
    }
}
