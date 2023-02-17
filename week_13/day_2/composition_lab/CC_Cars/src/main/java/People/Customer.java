package People;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, double money ) {
        this.name = name;
        this.money = money;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
