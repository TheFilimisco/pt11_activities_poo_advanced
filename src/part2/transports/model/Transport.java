package part2.transports.model;

import java.util.Objects;

public abstract class  Transport {
    private String licensePlate;
    private final short CURRENT_SPEED;

    protected Transport(short speed) {
        CURRENT_SPEED = speed;
    }

    protected String getLicensePlate() {
        return licensePlate;
    }
    protected void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    protected short getNORMAL_VELOCITY() {
        return CURRENT_SPEED;
    }

    protected abstract double getTimeByHour();
    protected abstract double getPriceByDistanceTraveled(int distanceTraveled);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport transport)) return false;
        return Objects.equals(licensePlate, transport.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(licensePlate);
    }

    @Override
    public String toString() {
        return "licensePlate='" + licensePlate + '\'' +
                ", CURRENT_SPEED=" + CURRENT_SPEED +
                '}';
    }
}
