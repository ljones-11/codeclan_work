package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed{

Visitor visitor;
    private double price;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.price = 4.5;
    }

    public double defaultPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getAge() < 12){
            return this.price * 0.5;
        } else {
            return this.price;
        }

    }

}
