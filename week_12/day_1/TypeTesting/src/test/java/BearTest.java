import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {

    private Bear bear;

    @Before
    public void setup() {
        bear = new Bear("Baloo", 56, 200.3, 'f');
    }



    @Test
    public void bearHasName() {
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void bearHasAge(){
        assertEquals(56, bear.getAge());
    }

    @Test
    public void bearHasWeight(){
        assertEquals(200.3, bear.getWeight(), 0.0);
    }

    @Test
    public void bearIsReadyToHibernateIfGreaterThan200() {
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void bearIsNotReadyToHibernateIfLessThan200() {
        Bear bear = new Bear("Joe", 13, 90, 'm');
        assertEquals(false,bear.readyToHibernate() );
    }

    @Test
    public void bearHasASex() {
        assertEquals('f', bear.getSex());
    }
}
