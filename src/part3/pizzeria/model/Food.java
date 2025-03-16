package part3.pizzeria.model;

public class Food extends Item {
    private float weight;

    public Food(int id, String name, float price, float weight) {
        super(id, name, price);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Food{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
