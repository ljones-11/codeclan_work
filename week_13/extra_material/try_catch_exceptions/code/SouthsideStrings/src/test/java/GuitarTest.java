import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup(){
    guitar = new Guitar(InstrumentType.GUITAR, GuitarType.ELECTRIC, "Fender Telecaster", "Alder", "Seafoam Green", 6, 200, 400);
    }
    @Test
    public void guitarHasMaterial(){
        assertEquals("Alder", guitar.getMaterial());
    }
    @Test
    public void guitarHasModel(){
        assertEquals("Fender Telecaster", guitar.getModel());
    }
    @Test
    public void guitarHasColour(){
        assertEquals("Seafoam Green", guitar.getColour());
    }
    @Test
    public void guitarHasInstrumentType(){
        assertEquals(InstrumentType.GUITAR, guitar.getInstrumentType());
    }
    @Test
    public void guitarHasNumberOfString(){
        assertEquals(6, guitar.getNumberOfStrings());
    }
    @Test
    public void guitarHasGuitarType(){
        assertEquals(GuitarType.ELECTRIC, guitar.getGuitarType());
    }
    @Test
    public void guitarHasTradePrice(){
        assertEquals(200, guitar.getTradePrice(), 0);
    }
    @Test
    public void guitarHasRetailPrice(){
        assertEquals(400, guitar.getRetailPrice(), 0);
    }
    @Test
    public void guitarCanPlay(){
        assertEquals("Brrrrrr Electric guitar noise", guitar.play());
    }
    @Test
    public void getMarkupValue(){
        assertEquals(200, guitar.calculateMarkup(), 0.00);
    }
}
