package part1.vehicle.model;

public class FreightVehicle extends Vehicle{
    private double weightPMA;

    public FreightVehicle(String licensePlate, double weightPMA) {
        super(licensePlate);
        this.weightPMA = weightPMA;
    }

    @Override
    public double getPrice(int day) {
        return super.getPrice(day) + (20*weightPMA);
    }

    public double getWeightPMA() {
        return weightPMA;
    }

    public void setWeightPMA(double weightPMA) {
        this.weightPMA = weightPMA;
    }

    @Override
    public String toString() {
        return "FreightVehicle{" +
                "weightPMA=" + weightPMA +
                "} " + super.toString();
    }
}
