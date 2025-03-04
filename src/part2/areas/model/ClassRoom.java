package part2.areas.model;

public class ClassRoom extends Space{
    private int maximumCapacity;
    private boolean hisFoldingChairs;
    private int numberOfComputer;
    private boolean hisNetworkConnector;

    public ClassRoom(int codeId, float surfaceArea, boolean lightType, float electricityConsumptionByKwh, int maximumCapacity, boolean hisFoldingChairs, int numberOfComputer, boolean hisNetworkConnector) {
        super(codeId, surfaceArea, lightType, electricityConsumptionByKwh);
        this.maximumCapacity = maximumCapacity;
        this.hisFoldingChairs = hisFoldingChairs;
        this.numberOfComputer = numberOfComputer;
        this.hisNetworkConnector = hisNetworkConnector;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean isHisFoldingChairs() {
        return hisFoldingChairs;
    }

    public void setHisFoldingChairs(boolean hisFoldingChairs) {
        this.hisFoldingChairs = hisFoldingChairs;
    }

    public int getNumberOfComputer() {
        return numberOfComputer;
    }

    public void setNumberOfComputer(int numberOfComputer) {
        this.numberOfComputer = numberOfComputer;
    }

    public boolean isHisNetworkConnector() {
        return hisNetworkConnector;
    }

    public void setHisNetworkConnector(boolean hisNetworkConnector) {
        this.hisNetworkConnector = hisNetworkConnector;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "maximumCapacity=" + maximumCapacity +
                ", hisFoldingChairs=" + hisFoldingChairs +
                ", numberOfComputer=" + numberOfComputer +
                ", hisNetworkConnector=" + hisNetworkConnector +
                "} " + super.toString();
    }
}
