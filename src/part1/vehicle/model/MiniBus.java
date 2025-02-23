package part1.vehicle.model;

public class MiniBus extends Vehicle {
    private int carSeat;
    public MiniBus(String licensePlate, int carSeat) {
        super(licensePlate);
        this.carSeat = carSeat;
    }

    @Override
    public double getPrice(int day){
        return super.getPrice(day)+(carSeat*2);
    }

    public int getCarSeat() {
        return carSeat;
    }

    public void setCarSeat(int carSeat) {
        this.carSeat = carSeat;
    }

}
