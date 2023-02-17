package people;

import vehicles.Buyable;

public interface Consumer {
    public double getAvailableFunds();
    public void buy(Buyable buyable);
}
