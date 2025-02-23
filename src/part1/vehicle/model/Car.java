package part1.vehicle.model;

public class Car extends Vehicle{
    private int carSeat;

    public Car(String licensePlate, int carSeat) {
        super(licensePlate);
        this.carSeat = carSeat;
    }

    @Override
    public double getPrice(int day){
        return super.getPrice(day) * 1.5 + (carSeat*1.5);
    }


    public int getCarSeat() {
        return carSeat;
    }

    public void setCarSeat(int carSeat) {
        this.carSeat = carSeat;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carSeat=" + carSeat +
                "} " + super.toString();
    }
}
