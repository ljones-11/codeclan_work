import Instruments.Bass;
import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentType;
import Interfaces.ISell;
import Item.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private GuitarStrings guitarStrings;
    private Bass bass;

    private ISell iSell;


    @Before
    public void setup(){
        shop = new Shop();
        guitar = new Guitar(InstrumentType.GUITAR, GuitarType.ELECTRIC, "Gibson SG", "Ash", "Pearl White", 6, 1200, 600);
        bass = new Bass(InstrumentType.BASS, "Walnut", "Red Sunburst", "Fender P-Bass", 250.00, 475);
        guitarStrings = new GuitarStrings(2.50, 6.50, "Ernie Ball", 11);
    }

    @Test
    public void shopStockStartsEmpty(){assertEquals(0, shop.getStock().size());}

    @Test
    public void canAddStockToShop(){
        shop.addStock(guitar);
        shop.addStock(bass);
        assertEquals(2, shop.getStock().size());
    }
    @Test
    public void stockCanBeRemoved(){
        shop.addStock(guitarStrings);
        shop.addStock(bass);
        shop.removeStock(bass);
        assertEquals(1, shop.getStock().size());
    }
    @Test
    public void getProductMarkup(){
        assertEquals(4.00, guitarStrings.calculateMarkup(), 0.00);
    }
    @Test
    public void canCalculateTotalProfits(){
        shop.addStock(guitarStrings);
        shop.addStock(bass);
        shop.addStock(bass);
        shop.addStock(bass);
        assertEquals(679.00, shop.getTotalProfit(), 0.00);
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("bumbabumbabumbabum", shop.playInstrument(bass));
        assertEquals("Brrrrrr Electric guitar noise", shop.playInstrument(guitar));
    }
}
