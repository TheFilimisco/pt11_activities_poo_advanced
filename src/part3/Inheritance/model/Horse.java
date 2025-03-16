package part3.Inheritance.model;

public class Horse extends Animal implements SoundHorse {
    public Horse(int age, String name) {
        super(age, name);
    }

    @Override
    public void soundHorse() {
        System.out.println("Horse noise");
    }
}
