package part2.aquarium.test;

import part2.aquarium.model.Aquarium;
import part2.aquarium.model.Fish;
import part2.aquarium.model.Plant;

public class TestAquarium {
    public static void main(String[] args) {
        Fish fish = new Fish("Clown Fish","Pomacéntridos","H", 20.0f, 35.0f, 2.0f, 9.0f, "Australia", "L" ,12.0);
        Fish fish2 = new Fish("Surgeon Fish","Acanthuridae","M", 12.0f, 20.0f, 2.5f, 11.0f, "Africa", "a" ,9.0);
        System.out.println(fish);
        System.out.println(fish2);
        Plant plant = new Plant("Rose", "Rosaceae", "M", 30.0f, 40.0f, 3.0f, 4.0f, "S");
        System.out.println(plant);

        Aquarium aquarium = new Aquarium();
        aquarium.addNewOrganism(fish);
        aquarium.addNewOrganism(fish2);
        aquarium.addNewOrganism(plant);

        System.out.println("==============PH Tolerated==============");
        aquarium.getPHsToleratedByOrganism();
        System.out.println("==============Temperature Tolerated==============");
        aquarium.getTemperaturesToleratedByOrganism();
        System.out.println("===================TypeOfLight By Organism===========");
        aquarium.getLightTypeByOrganism();
        System.out.println("====================Fishes Dietary===================");
        aquarium.getFishesDietaryByFish();
        System.out.println("====================Type Of Plants==================");
        aquarium.getTypeOfPlantByPlant();

        System.out.println("=================Get All Organism=================");
        aquarium.getOrganisms();
    }
}
