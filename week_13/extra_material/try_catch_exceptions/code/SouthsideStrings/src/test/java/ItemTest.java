import Item.Accessory;
import Item.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Accessory accessory;
    GuitarStrings guitarStrings;

    ;@Before
    public void setup(){
        accessory = new Accessory(5,25, "Guitar strap", "Guitar Accessories");
        guitarStrings = new GuitarStrings(2.00, 6.50, "Ernie Ball Regular Slinky", 9);
    }


    @Test
    public void accessoryHasTradePrice(){
        assertEquals(5, accessory.getTradePrice(), 0.00);
    }
    @Test
    public void accessoryHasRetailPrice(){
        assertEquals(25, accessory.getRetailPrice(), 0.00);
    }
    @Test
    public void accessoryHasDescription(){
        assertEquals("Guitar strap", accessory.getDescription());
    }
    @Test
    public void accessoryHasCategory(){
        assertEquals("Guitar Accessories", accessory.getCategory());
    }
    @Test
    public void stringsHaveTradePrice(){ assertEquals(2, guitarStrings.getTradePrice(), 0.00);}
    @Test
    public void stringsHaveRetailPrice(){ assertEquals(6.50, guitarStrings.getRetailPrice(), 0.00);}
    @Test
    public void stringsHaveDescription(){ assertEquals("Ernie Ball Regular Slinky", guitarStrings.getDescription());}
    public void stringsHaveGauge(){ assertEquals(9, guitarStrings.getStringGauge());}

}
