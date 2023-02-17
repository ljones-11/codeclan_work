package people;

import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    private ArrayList visitedAttractions = new ArrayList<>();
    private Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("dodgems1", 5);
        visitor = new Visitor(14, 1.2, 40.0);
    }


    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void visitorCanBeAddedToList(){
        visitor.addVisitedAttraction(dodgems);
        assertEquals(1, visitor.getVisitedAttractions().size());
    }
}
