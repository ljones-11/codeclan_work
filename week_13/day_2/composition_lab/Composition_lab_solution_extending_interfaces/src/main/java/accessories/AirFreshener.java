package accessories;

import people.Consumer;
import vehicles.Buyable;

public class AirFreshener implements Buyable {
    @Override
    public boolean canBuy(Consumer consumer) {
        return true;
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
