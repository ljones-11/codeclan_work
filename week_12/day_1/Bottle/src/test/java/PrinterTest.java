import org.example.Printer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void setup() {
        printer = new Printer(50, 100);
    }

    @Test
    public void printerHasPaper(){
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void printerWillNotPrintIfNotEnoughPaper(){
        printer.print(100,20);
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void printerWillPrintAndReduceSheets(){
        printer.print(2,10);
        assertEquals(30, printer.getSheets());
    }

    @Test
    public void printerHasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void tonerReducesAfterPrinting(){
        printer.print(2,10);
        assertEquals(80, printer.getToner());
    }


}
