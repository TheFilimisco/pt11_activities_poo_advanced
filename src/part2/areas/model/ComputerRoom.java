package part2.areas.model;


public class ComputerRoom extends ClassRoom {
    private int quantityPrinters;
    private final int SPACE_PRINTER = 1;

    public int getSPACE_PRINTER() {
        return SPACE_PRINTER;
    }

    public ComputerRoom(int codeId, float surfaceArea, boolean lightType, float electricityConsumptionByKwh, int maximumCapacity, boolean hisFoldingChairs, int numberOfComputer, boolean hisNetworkConnector, int quantityPrinters) {
        super(codeId, surfaceArea, lightType, electricityConsumptionByKwh, maximumCapacity, hisFoldingChairs, numberOfComputer, hisNetworkConnector);
        this.quantityPrinters = quantityPrinters;
    }

    public int getQuantityPrinters() {
        return quantityPrinters;
    }

    public void setQuantityPrinters(int quantityPrinters) {
        this.quantityPrinters = quantityPrinters;
    }

    @Override
    public float getSurfaceAreaByStudent() {
        return (getSurfaceArea()/getMaximumCapacity()) - (quantityPrinters*SPACE_PRINTER);
    }

    @Override
    public String toString() {
        return "ComputerRoom{" +
                "quantityPrinters=" + quantityPrinters +
                ", SPACE_PRINTER=" + SPACE_PRINTER +
                "} " + super.toString();
    }
}
