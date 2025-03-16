package part3.pizzeria.model;

public class Drink extends Item{
    private float volume;

    public Drink(int id, String name, float price, float volume) {
        super(id, name, price);
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "volume=" + volume +
                "} " + super.toString();
    }
}
