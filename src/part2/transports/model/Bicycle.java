package part2.transports.model;

public class Bicycle extends Transport {
    private int gears;

    public Bicycle(short speed, int gears) {
        super(speed);
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gears=" + gears +
                "} " + super.toString();
    }
}
