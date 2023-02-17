import attractions.Attraction;
import attractions.Dodgems;
import attractions.Park;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.Stall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

private ThemePark themePark;
private Dodgems dodgems1;
private Dodgems dodgems2;
private Dodgems dodgems3;
private Visitor visitor;

private IceCreamStall iceCreamStall1;
private IceCreamStall iceCreamStall2;
private IceCreamStall iceCreamStall3;

private ArrayList attractions = new ArrayList<>();
private ArrayList stalls = new ArrayList<>();

    @Before
    public void setup(){
        dodgems1 = new Dodgems("Dodgems1", 4);
        dodgems2 = new Dodgems("Dodgems2", 5);
        dodgems3 = new Dodgems("Dodgems3", 2);
        themePark = new ThemePark();
        visitor = new Visitor(33,123, 45);

    }

    @Test
    public void parkHasAttractions(){
        themePark.addAttractionToList(dodgems1);
        themePark.addAttractionToList(dodgems2);
        themePark.addAttractionToList(dodgems3);

        assertEquals(3, themePark.getAttractions().size());
    }

    @Test
    public void parkHasStalls(){
        themePark.addStallToList(iceCreamStall1);
        themePark.addStallToList(iceCreamStall2);
        themePark.addStallToList(iceCreamStall3);
        assertEquals(3, themePark.getStalls().size());
    }

    @Test
    public void canGetAllReviewed(){
        themePark.addAttractionToList(dodgems1);
        themePark.addStallToList(iceCreamStall1);
        assertEquals(2, themePark.getAllReviewed().size());
    }

    @Test
    public void visitIncrementsCountAndAddsAttraction(){
        themePark.addAttractionToList(dodgems1);
        themePark.visit(visitor, dodgems1);
        assertEquals(1, dodgems1.getVisitCount());
        assertEquals(1, visitor.getVisitedAttractions().size());
    }
}
