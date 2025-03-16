package part3.Inheritance.model;

public class Pegasus extends Animal implements SoundBird,SoundHorse{

    public Pegasus(int age, String name) {
        super(age, name);
    }

    @Override
    public void soundBird() {
        System.out.println("Sound Bird");
    }
    @Override
    public void soundHorse() {
        System.out.println("Sound Horse");
    }
}
