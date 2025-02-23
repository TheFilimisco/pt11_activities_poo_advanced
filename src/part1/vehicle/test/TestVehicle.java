package part1.vehicle.test;

import part1.vehicle.model.*;

public class TestVehicle {
    public static void main(String[] args) {
        ManagerVehicle managerVehicle = new ManagerVehicle();


        //Vehicle
        managerVehicle.addVehicle(new Vehicle("XXX"));
        System.out.println(managerVehicle.getVehicle("XXX").getPrice(3));

        //Car
        managerVehicle.addVehicle(new Car("XXX1", 4));
        System.out.println(managerVehicle.getVehicle("XXX1").getPrice(3));

        //MiniBus
        managerVehicle.addVehicle(new MiniBus("XXX3",2));
        System.out.println(managerVehicle.getVehicle("XXX3").getPrice(3));

        //FreightVehicle
        managerVehicle.addVehicle(new FreightVehicle("XXX4",200));
        System.out.println(managerVehicle.getVehicle("XXX4").getPrice(3));

        //Truck
        managerVehicle.addVehicle(new Truck("XXX5",200));
        System.out.println(managerVehicle.getVehicle("XXX5").getPrice(3));


        managerVehicle.showAllVehicle();

    }
}
