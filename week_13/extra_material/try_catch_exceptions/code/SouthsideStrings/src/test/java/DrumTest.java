import Instruments.Drums;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drums drums;

    @Before
    public void setup(){
        drums = new Drums(InstrumentType.DRUMS, "Birch", "Black", "Pearl Roadshow", 800, 1400);
    }
    @Test
    public void drumsHaveMaterial(){
        assertEquals("Birch", drums.getMaterial());
    }
    @Test
    public void drumsHaveModel(){
        assertEquals("Pearl Roadshow", drums.getModel());
    }
    @Test
    public void drumsHaveColour(){
        assertEquals("Black", drums.getColour());
    }
    @Test
    public void drumsHaveInstrumentType(){
        assertEquals(InstrumentType.DRUMS, drums.getInstrumentType());
    }
    @Test
    public void drumsHaveTradePrice(){
        assertEquals(800, drums.getTradePrice(), 0);
    }
    @Test
    public void drumsHaveRetailPrice(){
        assertEquals(1400, drums.getRetailPrice(), 0);
    }
    @Test
    public void drumsCanPlay(){
        assertEquals("Bang, Bang, Crash", drums.play());
    }
}
