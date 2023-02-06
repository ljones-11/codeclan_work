import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void calculatorAddsTwoNumbers() {
        assertEquals(6, calculator.add(2,4));
    }

    @Test
    public void calculatorSubtractsTwoNumbers() {
        assertEquals(2, calculator.subtract(8,6));
    }

    @Test
    public void calculatorMultipliesTwoNumbers() {
        assertEquals(8, calculator.multiply(2,4));
    }

    @Test
    public void calculatorDividesTwoNumbers() {
        assertEquals(2, calculator.divide(8,4), 0);
    }






}
