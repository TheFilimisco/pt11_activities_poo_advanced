package part2.transports.model;

public class Car extends Transport{
    private final TypeOfFuel typeOfFuel;
    private double priceFuelByLiters;
    private final double SPELL_LITERS_FUEL_BY_KM;

    public enum TypeOfFuel{
        DIESEL,GASOLINE,PREMIUM
    }

    public Car(short speed, TypeOfFuel typeOfFuel, double priceFuelByLiters, double SPELL_LITERS_FUEL_BY_KM) {
        super(speed);
        this.typeOfFuel = typeOfFuel;
        this.priceFuelByLiters = priceFuelByLiters;
        this.SPELL_LITERS_FUEL_BY_KM = SPELL_LITERS_FUEL_BY_KM;
    }

    public TypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public double getPriceByFuel() {
        return priceFuelByLiters;
    }

    public void setPriceByFuel(double priceByFuel) {
        this.priceFuelByLiters = priceByFuel;
    }

    public double getSPELL_FUEL_BY_KM() {
        return SPELL_LITERS_FUEL_BY_KM;
    }
    
    @Override
    public double getPriceByDistanceTraveled(int distanceTraveled) {
        return (distanceTraveled/SPELL_LITERS_FUEL_BY_KM) * priceFuelByLiters;
    }

    @Override
    public String toString() {
        return "Car{" +
                "typeOfFuel=" + typeOfFuel +
                ", priceFuelByLiters=" + priceFuelByLiters +
                ", SPELL_LITERS_FUEL_BY_KM=" + SPELL_LITERS_FUEL_BY_KM +
                "} " + super.toString();
    }
}
