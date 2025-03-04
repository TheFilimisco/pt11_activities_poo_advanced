package part2.areas.model;

public class GymRoom extends Space{
    private boolean hisShower;
    private int quantityBleachers;

    public GymRoom(int codeId, float surfaceArea, boolean lightType, float electricityConsumptionByKwh, boolean hisShower, int quantityBleachers) {
        super(codeId, surfaceArea, lightType, electricityConsumptionByKwh);
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
    public String toString() {
        return "GymRoom{" +
                "hisShower=" + hisShower +
                ", quantityBleachers=" + quantityBleachers +
                "} " + super.toString();
    }
}
