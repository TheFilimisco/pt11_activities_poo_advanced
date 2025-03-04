package part2.areas.model;

public class Office extends Space{
    private int numberTables;
    private boolean coffeeMachine;

    public Office(int codeId, float surfaceArea, boolean lightType, float electricityConsumptionByKwh) {
        super(codeId, surfaceArea, lightType, electricityConsumptionByKwh);
    }

    public int getNumberTables() {
        return numberTables;
    }

    public void setNumberTables(int numberTables) {
        this.numberTables = numberTables;
    }

    public boolean isCoffeeMachine() {
        return coffeeMachine;
    }

    public void setCoffeeMachine(boolean coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public String toString() {
        return "Office{" +
                "numberTables=" + numberTables +
                ", coffeeMachine=" + coffeeMachine +
                "} " + super.toString();
    }
}
