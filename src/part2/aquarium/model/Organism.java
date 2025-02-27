package part2.aquarium.model;

public class Organism {
    private String nameOrganism;
    final private String nameFamily;
    final private LightTypeByNecessity lightTypeByNecessity;
    final private short minToleratedTemperature;
    final private short maxToleratedTemperature;
    final private short minToleratedPH;
    final private short maxToleratedPH;

    public enum LightTypeByNecessity{
        High, Medium, Low
    }

    public Organism(String nameOrganism, String nameFamily, LightTypeByNecessity lightTypeByNecessity, short minToleratedTemperature, short maxToleratedTemperature, short minToleratedPH, short maxToleratedPH) {
        this.nameOrganism = nameOrganism;
        this.nameFamily = nameFamily;
        this.lightTypeByNecessity = lightTypeByNecessity;
        this.minToleratedTemperature = minToleratedTemperature;
        this.maxToleratedTemperature = maxToleratedTemperature;
        this.minToleratedPH = minToleratedPH;
        this.maxToleratedPH = maxToleratedPH;
    }

    public String getNameOrganism() {
        return nameOrganism;
    }

    public void setNameOrganism(String nameOrganism) {
        this.nameOrganism = nameOrganism;
    }

    public String getNameFamily() {
        return nameFamily;
    }

    public LightTypeByNecessity getLightTypeByNecessity() {
        return lightTypeByNecessity;
    }

    public short getMinToleratedTemperature() {
        return minToleratedTemperature;
    }

    public short getMaxToleratedTemperature() {
        return maxToleratedTemperature;
    }

    public short getMinToleratedPH() {
        return minToleratedPH;
    }

    public short getMaxToleratedPH() {
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
