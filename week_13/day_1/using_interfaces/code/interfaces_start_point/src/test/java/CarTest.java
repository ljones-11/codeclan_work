import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {


    @Test
    public void canConvertCar(){
//        given we have a car
        Car car = new Car("Tesla", 3);
//        when we pass it to the convertor;
        String message = Converter.process(car);
//        Then we should see some converted string
        assertEquals("Car Data" ,message);

    }
}
