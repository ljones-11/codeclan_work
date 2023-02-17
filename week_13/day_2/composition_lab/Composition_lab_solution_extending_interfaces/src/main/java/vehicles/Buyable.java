package vehicles;

import people.Consumer;
import people.Customer;

public interface Buyable {

    public boolean canBuy(Consumer consumer);
    public double getPrice();
}
