import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BicycleTest {
    private Bicycle bicycle;

    @Before
    public void before() {
        bicycle = new Bicycle();
    }

    @Test
    public void hasDistanceAtBeginning() {
        assertEquals(0, bicycle.getDistanceTravelled());
    }
    @Test
    public void bicycleCanMove(){
        bicycle.move(10);
        assertEquals(10, bicycle.getDistanceTravelled());
    }

    @Test
    public void bicycleCanStart(){
        assertEquals("Bike started", bicycle.start());
    }
    @Test
    public void bicycleCanStop(){
        assertEquals("Bike stopped", bicycle.stop());
    }
}
