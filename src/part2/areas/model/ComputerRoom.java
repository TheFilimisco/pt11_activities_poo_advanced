package part2.areas.model;


public class ComputerRoom extends Space {
    private int quantityPrinters;

    public ComputerRoom(int codeId, float surfaceArea, boolean lightType, float electricityConsumptionByKwh, int quantityPrinters) {
        super(codeId, surfaceArea, lightType, electricityConsumptionByKwh);
        this.quantityPrinters = quantityPrinters;
    }

    public int getQuantityPrinters() {
        return quantityPrinters;
    }

    public void setQuantityPrinters(int quantityPrinters) {
        this.quantityPrinters = quantityPrinters;
    }

    @Override
    public String toString() {
        return "ComputerRoom{" +
                "quantityPrinters=" + quantityPrinters +
                "} " + super.toString();
    }
}
