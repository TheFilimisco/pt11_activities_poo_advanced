package part1.vehicle.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerVehicle {
    List<Vehicle> vehicles;

    public ManagerVehicle() {
        vehicles = new ArrayList<>();
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public Vehicle getVehicle(String licensePlate){
        return vehicles.stream()
                .filter(vehicle -> vehicle.getLicensePlate().equals(licensePlate))
                .findFirst()
                .orElse(null);
    }

    public void showAllVehicle(){
        vehicles.forEach(System.out::println);
    }


}
