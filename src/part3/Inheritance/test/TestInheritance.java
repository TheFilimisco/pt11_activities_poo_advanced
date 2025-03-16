package part3.Inheritance.test;

import part3.Inheritance.model.Bird;
import part3.Inheritance.model.Horse;
import part3.Inheritance.model.Pegasus;

public class TestInheritance {
    public static void main(String[] args) {
        Bird bird = new Bird(12, "Bird");
        bird.soundBird();
        Horse horse = new Horse(12, "Horse");
        horse.soundHorse();
        Pegasus pegasus = new Pegasus(21, "Pegasus");
        pegasus.soundBird();
        pegasus.soundHorse();
    }
}
