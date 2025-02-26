package part2.transports.model;

public class Car extends Transport{
    private TypeOfFuel typeOfFuel;
    private double priceByFuel;
    private final double SPELL_FUEL_BY_KM;

    public Car(short speed, TypeOfFuel typeOfFuel, double priceByFuel, double SPELL_FUEL_BY_KM) {
        super(speed);
        this.typeOfFuel = typeOfFuel;
        this.priceByFuel = priceByFuel;
        this.SPELL_FUEL_BY_KM = SPELL_FUEL_BY_KM;
    }

    enum TypeOfFuel{
        DIESEL,GASOLINE,PREMIUM
    }

    public TypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(TypeOfFuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public double getPriceByFuel() {
        return priceByFuel;
    }

    public void setPriceByFuel(double priceByFuel) {
        this.priceByFuel = priceByFuel;
    }

    public double getSPELL_FUEL_BY_KM() {
        return SPELL_FUEL_BY_KM;
    }

    @Override
    protected double getTimeByHour() {
        return 0;
    }

    @Override
    protected double getPriceByDistanceTraveled(int distanceTraveled) {
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "typeOfFuel=" + typeOfFuel +
                ", priceByFuel=" + priceByFuel +
                ", SPELL_FUEL_BY_KM=" + SPELL_FUEL_BY_KM +
                "} " + super.toString();
    }
}
