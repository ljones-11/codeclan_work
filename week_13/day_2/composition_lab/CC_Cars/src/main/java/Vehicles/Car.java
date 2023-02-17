package Vehicles;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Car extends Vehicle {

    private Engine engine;

    public Car(String colour, double price, int doors, Engine engine) {
        super(colour, price, doors);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
