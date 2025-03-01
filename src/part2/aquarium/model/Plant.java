package part2.aquarium.model;

public class Plant extends Organism {
    final private TypeOfPlant typeOfPlant;

    public enum TypeOfPlant{
        Stem, Bulb, Roots
    }

    public Plant(String nameOrganism, String nameFamily, String lightTypeByNecessity, float minToleratedTemperature, float maxToleratedTemperature, float minToleratedPH, float maxToleratedPH, String typeOfPlant) {
        super(nameOrganism, nameFamily, lightTypeByNecessity, minToleratedTemperature, maxToleratedTemperature, minToleratedPH, maxToleratedPH);
        switch (typeOfPlant.toUpperCase()){
            case "S":
                this.typeOfPlant = TypeOfPlant.Stem;
                break;
            case "B":
                this.typeOfPlant = TypeOfPlant.Bulb;
                break;
            case "R":
                this.typeOfPlant = TypeOfPlant.Roots;
                break;
            default:
                throw new IllegalArgumentException("Invalid light Type: " + lightTypeByNecessity);
        }
    }

    public TypeOfPlant getTypeOfPlant() {
        return typeOfPlant;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "typeOfPlant=" + typeOfPlant +
                "} " + super.toString();
    }
}
