import accessories.AirFreshener;
import components.Battery;
import components.ElectricMotor;
import components.Till;
import org.junit.Test;
import people.Consumer;
import people.Customer;
import people.DealerShip;
import vehicles.Buyable;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class AccessoryTest {
    @Test
    public void canBuyAccessory() {
        Buyable accessory = new AirFreshener();
        Vehicle elec = new ElectricCar(4, 10000, "Green", new ElectricMotor(new Battery(100)));
        DealerShip ds = new DealerShip("Ben", new Till(100.00));
        Consumer cust = new Customer("Alison", 99.99);

        ds.buyProduct(accessory, cust);
        ds.buyProduct(elec, cust);
    }
}
