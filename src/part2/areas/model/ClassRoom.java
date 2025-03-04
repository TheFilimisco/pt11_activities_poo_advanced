package part2.areas.model;

public abstract class ClassRoom extends Space{
    private int maximumCapacity;
    private boolean hisFoldingChairs;
    private int numberOfComputer;
    private boolean hisNetworkConnector;

    protected ClassRoom(int codeId, float surfaceArea, boolean lightType, float electricityConsumptionByKwh, int maximumCapacity, boolean hisFoldingChairs, int numberOfComputer, boolean hisNetworkConnector) {
        super(codeId, surfaceArea, lightType, electricityConsumptionByKwh);
        this.maximumCapacity = maximumCapacity;
        this.hisFoldingChairs = hisFoldingChairs;
        this.numberOfComputer = numberOfComputer;
        this.hisNetworkConnector = hisNetworkConnector;
    }

    protected int getMaximumCapacity() {
        return maximumCapacity;
    }

    protected void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    protected boolean isHisFoldingChairs() {
        return hisFoldingChairs;
    }

    protected void setHisFoldingChairs(boolean hisFoldingChairs) {
        this.hisFoldingChairs = hisFoldingChairs;
    }

    protected int getNumberOfComputer() {
        return numberOfComputer;
    }

    protected void setNumberOfComputer(int numberOfComputer) {
        this.numberOfComputer = numberOfComputer;
    }

    protected boolean isHisNetworkConnector() {
        return hisNetworkConnector;
    }

    protected void setHisNetworkConnector(boolean hisNetworkConnector) {
        this.hisNetworkConnector = hisNetworkConnector;
    }

    public abstract float getSurfaceAreaByStudent();

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
