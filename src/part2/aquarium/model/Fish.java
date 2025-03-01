package part2.aquarium.model;

public class Fish extends Organism{
    final private String originFish;
    final private DietaryScale dietaryScale;
    final private double lengthFish;

    public Fish(String nameOrganism, String nameFamily, String lightTypeByNecessity, float minToleratedTemperature, float maxToleratedTemperature, float minToleratedPH, float maxToleratedPH, String originFish, String dietaryScale, double lengthFish) {
        super(nameOrganism, nameFamily, lightTypeByNecessity, minToleratedTemperature, maxToleratedTemperature, minToleratedPH, maxToleratedPH);
        switch (dietaryScale.toUpperCase()){
            case "L":
                this.dietaryScale = DietaryScale.Leaves;
                break;
            case "A":
                this.dietaryScale = DietaryScale.Algae;
                break;
            case "O":
                this.dietaryScale = DietaryScale.Omnivore;
                break;
            default:
                throw new IllegalArgumentException("Invalid light Type: " + lightTypeByNecessity);
        }
        this.originFish = originFish;
        this.lengthFish = lengthFish;
    }

    public enum DietaryScale {
        Algae, Omnivore, Leaves
    }

    public String getOriginFish() {
        return originFish;
    }

    public DietaryScale getDietaryScale() {
        return dietaryScale;
    }
    public double getLengthFish() {
        return lengthFish;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "originFish='" + originFish + '\'' +
                ", dietaryScale=" + dietaryScale +
                ", lengthFish=" + lengthFish +
                "} " + super.toString();
    }
}
