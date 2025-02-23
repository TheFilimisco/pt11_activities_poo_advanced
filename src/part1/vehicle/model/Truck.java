package part1.vehicle.model;

public class Truck extends FreightVehicle{
    public Truck(String licensePlate, double weightPMA) {
        super(licensePlate, weightPMA);
    }

    @Override
    public double getPrice(int day) {
        return super.getPrice(day) + 40;
    }

    @Override
    public String toString() {
        return "Truck{} " + super.toString();
    }
}
