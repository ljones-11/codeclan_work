package vehicles;

import people.Consumer;
import people.Customer;

public abstract class Vehicle implements Buyable{

    private int capacity;
    private double price;
    private String colour;

    public Vehicle(int capacity, double price, String colour) {
        this.capacity = capacity;
        this.price = price;
        this.colour = colour;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public boolean canBuy(Consumer consumer){
        if (consumer.getAvailableFunds() >= this.price){
            return true;
        }
        return false;
    }

    public void addDamage(double cost){
        this.price -= cost;
    }

    public void repair(double cost){
        this.price += cost;
    }
}
