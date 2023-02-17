package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(20, 201, 50);
        visitor2 = new Visitor(13, 140, 10);
        visitor3 = new Visitor(11, 140, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }
    @Test

    public void hasPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.00);
    }

    @Test
    public void chargesDoubleForOver200(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0.00);
    }
    @Test
    public void restrictsTooShort(){
        assertFalse(rollerCoaster.isAllowedTo(visitor2));
    }
    @Test
    public void restrictsTooYoung(){
        assertFalse(rollerCoaster.isAllowedTo(visitor3));
    }
}
