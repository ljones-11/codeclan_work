package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

        private double price;
    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    public double defaultPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() > 145 && visitor.getAge() > 12;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200){
            return this.price * 2;
        } else {
            return this.price;
        }



    }
}
