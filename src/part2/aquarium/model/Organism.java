package part2.aquarium.model;

public abstract class Organism {
    private String nameOrganism;
    final private String nameFamily;
    final private LightTypeByNecessity lightTypeByNecessity;
    final private float minToleratedTemperature;
    final private float maxToleratedTemperature;
    final private float minToleratedPH;
    final private float maxToleratedPH;

    public enum LightTypeByNecessity{
        High, Medium, Low
    }

    protected Organism(String nameOrganism, String nameFamily, String lightTypeByNecessity, float minToleratedTemperature, float maxToleratedTemperature, float minToleratedPH, float maxToleratedPH) {
        switch (lightTypeByNecessity.toUpperCase()){
            case "H":
                this.lightTypeByNecessity = LightTypeByNecessity.High;
                break;
            case "M":
                this.lightTypeByNecessity = LightTypeByNecessity.Medium;
                break;
            case "L":
                this.lightTypeByNecessity = LightTypeByNecessity.Low;
                break;
            default:
                throw new IllegalArgumentException("Invalid light Type: " + lightTypeByNecessity);
        }
        this.nameOrganism = nameOrganism;
        this.nameFamily = nameFamily;
        this.minToleratedTemperature = minToleratedTemperature;
        this.maxToleratedTemperature = maxToleratedTemperature;
        this.minToleratedPH = minToleratedPH;
        this.maxToleratedPH = maxToleratedPH;
    }

    protected String getNameOrganism() {
        return nameOrganism;
    }

    protected void setNameOrganism(String nameOrganism) {
        this.nameOrganism = nameOrganism;
    }

    protected String getNameFamily() {
        return nameFamily;
    }

    protected LightTypeByNecessity getLightTypeByNecessity() {
        return lightTypeByNecessity;
    }

    protected float getMinToleratedTemperature() {
        return minToleratedTemperature;
    }

    protected float getMaxToleratedTemperature() {
        return maxToleratedTemperature;
    }

    protected float getMinToleratedPH() {
        return minToleratedPH;
    }

    protected float getMaxToleratedPH() {
        return maxToleratedPH;
    }

    @Override
    public String toString() {
        return "Organism{" +
                "nameOrganism='" + nameOrganism + '\'' +
                ", nameFamily='" + nameFamily + '\'' +
                ", lightTypeByNecessity=" + lightTypeByNecessity +
                ", minToleratedTemperature=" + minToleratedTemperature +
                ", maxToleratedTemperature=" + maxToleratedTemperature +
                ", minToleratedPH=" + minToleratedPH +
                ", maxToleratedPH=" + maxToleratedPH +
                '}';
    }
}
