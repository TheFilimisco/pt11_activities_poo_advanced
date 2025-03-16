package part3.pizzeria.model;

public class Pizza extends Food{
    private Size size;
    private IExtraIngredient extraIngredient;

    public enum Size{
        SMALL, LARGE, X_LARGE
    }

    public Pizza(int id, String name, float price, float weight, Size size) {
        super(id, name, price, weight);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                "} " + super.toString();
    }
}
