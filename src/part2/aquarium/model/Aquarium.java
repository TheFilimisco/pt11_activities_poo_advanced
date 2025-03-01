package part2.aquarium.model;

import java.util.HashSet;
import java.util.Set;

public class Aquarium {
    private Set<Organism> organisms;
    private final String LIGHT = " light ";
    private final String NEED = " need ";
    private final String SPACE = " : ";
    private final String LINE = " - ";

    public Aquarium() {
        organisms = new HashSet<Organism>();
    }

    public void getOrganisms() {
        organisms.forEach(System.out::println);
    }

    public void setOrganisms(Set<Organism> organisms) {
        this.organisms = organisms;
    }

    public void addNewOrganism(Organism organism){
        organisms.add(organism);
    }

    public void getPHsToleratedByOrganism(){
        organisms.forEach( organism -> System.out.println(organism.getNameOrganism() + SPACE + organism.getMinToleratedPH() + LINE+ organism.getMaxToleratedPH()));
    }

    public void getTemperaturesToleratedByOrganism(){
        organisms.forEach( organism -> System.out.println(organism.getNameOrganism() + SPACE + organism.getMinToleratedTemperature() + LINE + organism.getMaxToleratedTemperature()));
    }

    public void getLightTypeByOrganism(){
        organisms.forEach( organism -> System.out.println(organism.getNameOrganism() + NEED +  organism.getLightTypeByNecessity() + LIGHT));
    }

    public void getFishesDietaryByFish(){
        organisms.forEach( organism -> {
            if (organism instanceof Fish) {
                System.out.println(organism.getNameOrganism() + NEED + ((Fish) organism).getDietaryScale());
            }
        } );
    }

    public void getTypeOfPlantByPlant(){
        organisms.forEach( organism -> {
            if (organism instanceof Plant){
                System.out.println(organism.getNameOrganism() + SPACE + ((Plant) organism).getTypeOfPlant());
            }
        });
    }



}
