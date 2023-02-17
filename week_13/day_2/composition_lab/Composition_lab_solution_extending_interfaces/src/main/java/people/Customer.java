package people;

import vehicles.Buyable;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer implements Consumer {

    private String name;
    private double money;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getVehicleCount(){
        return this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle){
        addVehicle(vehicle);
        this.money -= vehicle.getPrice();
    }

    @Override
    public double getAvailableFunds() {
        return money;
    }

    @Override
    public void buy(Buyable buyable) {
        // TODO
    }
}
