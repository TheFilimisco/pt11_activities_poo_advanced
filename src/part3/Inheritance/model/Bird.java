package part3.Inheritance.model;

public class Bird extends Animal implements SoundBird{
    public Bird(int age, String name) {
        super(age, name);
    }

    @Override
    public void soundBird() {
        System.out.println("Bird noise");
    }
}
