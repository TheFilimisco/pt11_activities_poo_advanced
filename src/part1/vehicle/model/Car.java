package part1.vehicle.model;

public class Car extends Vehicle{
    public Car(String licensePlate) {
        super(licensePlate);
    }

    public double getPrice(int parking, int day) {
        return super.getPrice() + (1.5 * day * parking) ;
    }

}
