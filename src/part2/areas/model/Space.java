package part2.areas.model;

abstract class Space {
    final private int codeId;
    final private float surfaceArea;
    private boolean lightType;
    private float electricityConsumptionByKwh;

    protected Space(int codeId, float surfaceArea, boolean lightType, float electricityConsumptionByKwh) {
        this.codeId = codeId;
        this.surfaceArea = surfaceArea;
        this.lightType = lightType;
        this.electricityConsumptionByKwh = electricityConsumptionByKwh;
    }

    protected int getCodeId() {
        return codeId;
    }

    protected float getSurfaceArea() {
        return surfaceArea;
    }

    protected boolean isLightType() {
        return lightType;
    }

    protected void setLightType(boolean lightType) {
        this.lightType = lightType;
    }

    protected float getElectricityConsumptionByKwh() {
        return electricityConsumptionByKwh;
    }

    protected void setElectricityConsumptionByKwh(float electricityConsumptionByKwh) {
        this.electricityConsumptionByKwh = electricityConsumptionByKwh;
    }

    @Override
    public String toString() {
        return "Space{" +
                "codeId=" + codeId +
                ", surfaceArea=" + surfaceArea +
                ", lightType=" + lightType +
                ", electricityConsumptionByKwh=" + electricityConsumptionByKwh +
                '}';
    }
}

