package people;


import components.Till;
import vehicles.Buyable;
import vehicles.Vehicle;

import java.util.ArrayList;

public class DealerShip implements Consumer {

    private ArrayList<Vehicle> vehicles;
    private String name;
    private Till till;

    public DealerShip(String name, Till till) {
        this.name = name;
        this.till = till;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int vehicleCount(){
        return this.vehicles.size();
    }

    public void buyProduct(Buyable buyable, Consumer consumer) {
        if (buyable.canBuy(consumer) == true) {
            consumer.buy(buyable);
            this.till.addMoney(buyable.getPrice());
        }
    }

    public void sellCar(Vehicle vehicle, Customer customer){

        if (vehicle.canBuy(customer) == true){
            customer.buyVehicle(vehicle);
            this.till.addMoney(vehicle.getPrice());
        }
    }

    public void buyCar(Vehicle vehicle){
        if (vehicle.canBuy(this) == true) {
            this.till.removeMoney(vehicle.getPrice());
            this.vehicles.add(vehicle);
        }
    }

    public void repairVehicle(double cost, Vehicle vehicle){
        vehicle.repair(cost);
        this.till.removeMoney(cost);
    }

    public double getTillBalance() {
        return this.till.getBalance();
    }

    @Override
    public double getAvailableFunds() {
        return this.till.getBalance();
    }

    @Override
    public void buy(Buyable buyable) {
        // TODO
    }
}
