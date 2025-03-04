package part2.areas.model;

public class Laboratory extends ClassRoom{
    private int quantityBunsenBurners;

    public Laboratory(int codeId, float surfaceArea, boolean lightType, float electricityConsumptionByKwh, int maximumCapacity, boolean hisFoldingChairs, int numberOfComputer, boolean hisNetworkConnector, int quantityBunsenBurners) {
        super(codeId, surfaceArea, lightType, electricityConsumptionByKwh, maximumCapacity, hisFoldingChairs, numberOfComputer, hisNetworkConnector);
        this.quantityBunsenBurners = quantityBunsenBurners;
    }

    public int getQuantityBunsenBurners() {
        return quantityBunsenBurners;
    }

    public void setQuantityBunsenBurners(int quantityBunsenBurners) {
        this.quantityBunsenBurners = quantityBunsenBurners;
    }


    @Override
    public float getSurfaceAreaByStudent() {
        return getSurfaceArea()/getMaximumCapacity();
    }

    @Override
    public String toString() {
        return "Laboratory{" +
                "quantityBunsenBurners=" + quantityBunsenBurners +
                "} " + super.toString();
    }
}
