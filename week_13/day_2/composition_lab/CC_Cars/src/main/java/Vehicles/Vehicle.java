package Vehicles;

public abstract class Vehicle {

    private String colour;
    private double price;
    private int doors;

    public Vehicle(String colour, double price, int doors) {
        this.colour = colour;
        this.price = price;
        this.doors = doors;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
