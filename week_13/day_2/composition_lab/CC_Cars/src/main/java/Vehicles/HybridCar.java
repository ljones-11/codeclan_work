package Vehicles;
import Components.Engine;
import Components.Motor;

public class HybridCar extends Vehicle {

    private Engine engine;
    private Motor motor;


    public HybridCar(String colour, double price, int doors, Engine engine, Motor motor) {
        super(colour, price, doors);
        this.engine = engine;
        this.motor = motor;
    }
}
