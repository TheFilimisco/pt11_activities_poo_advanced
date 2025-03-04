package part2.areas.model;

public class GymRoom extends ClassRoom{
    private boolean hisShower;
    private int quantityBleachers;
    private final int VOLUME_BLEACHERS = 1;

    public GymRoom(int codeId, float surfaceArea, boolean lightType, float electricityConsumptionByKwh, int maximumCapacity, boolean hisFoldingChairs, int numberOfComputer, boolean hisNetworkConnector, boolean hisShower, int quantityBleachers) {
        super(codeId, surfaceArea, lightType, electricityConsumptionByKwh, maximumCapacity, hisFoldingChairs, numberOfComputer, hisNetworkConnector);
        this.hisShower = hisShower;
        this.quantityBleachers = quantityBleachers;
    }

    public boolean isHisShower() {
        return hisShower;
    }

    public void setHisShower(boolean hisShower) {
        this.hisShower = hisShower;
    }

    public int getQuantityBleachers() {
        return quantityBleachers;
    }

    public void setQuantityBleachers(int quantityBleachers) {
        this.quantityBleachers = quantityBleachers;
    }

    @Override
    public float getSurfaceAreaByStudent() {
        return (getSurfaceArea()/getMaximumCapacity()) + (VOLUME_BLEACHERS*quantityBleachers);
    }

    @Override
    public String toString() {
        return "GymRoom{" +
                "hisShower=" + hisShower +
                ", quantityBleachers=" + quantityBleachers +
                ", VOLUME_BLEACHERS=" + VOLUME_BLEACHERS +
                "} " + super.toString();
    }
}
