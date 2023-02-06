import org.example.Bottle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BottleTest {

    private Bottle bottle;

    @Before

    public void setup() {
        bottle = new Bottle();
    }


    @Test
    public void bottleHasVolume() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void bottleLoses10WhenDrunk() {
        bottle.drink();
        assertEquals(90, bottle.getRemainingVolume());
    }

    @Test
    public void bottleLoses20WhenDrunkTwice() {
        bottle.drink();
        bottle.drink();
        assertEquals(80, bottle.getRemainingVolume());
    }

    @Test
    public void bottleCanBeEmptied() {
        bottle.empty();
        assertEquals(0, bottle.getRemainingVolume());
    }

    @Test
    public void bottleCanBeFilled() {
        bottle.fill();
        assertEquals(100, bottle.getRemainingVolume());
    }

}
