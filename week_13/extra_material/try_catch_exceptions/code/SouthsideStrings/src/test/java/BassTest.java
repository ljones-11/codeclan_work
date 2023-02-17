import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassTest {

    Bass bass;

    @Before
    public void setup(){
        bass = new Bass(InstrumentType.BASS, "Oak", "Pelham Blue", "Fender Jazz Bass", 300, 600);
    }
    @Test
    public void bassHasMaterial(){
        assertEquals("Oak", bass.getMaterial());
    }
    @Test
    public void bassHasModel(){
        assertEquals("Fender Jazz Bass", bass.getModel());
    }
    @Test
    public void bassHasColour(){
        assertEquals("Pelham Blue", bass.getColour());
    }
    @Test
    public void bassHasInstrumentType(){
        assertEquals(InstrumentType.BASS, bass.getInstrumentType());
    }
    @Test
    public void bassHasTradePrice(){
        assertEquals(300, bass.getTradePrice(), 0);
    }
    @Test
    public void bassHasRetailPrice(){
        assertEquals(600, bass.getRetailPrice(), 0);
    }
    @Test
    public void bassCanPlay(){
        assertEquals("bumbabumbabumbabum", bass.play());
    }


}
