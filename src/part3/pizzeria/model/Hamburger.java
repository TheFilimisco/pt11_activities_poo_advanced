package part3.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class Hamburger extends Food implements IExtraIngredient{
    final private TypeOfHamburger typeOfHamburger;
    final private List<Item> extraIngredients;

    public Hamburger(int id, String name, float price, float weight, TypeOfHamburger typeOfHamburger) {
        super(id, name, price, weight);
        this.typeOfHamburger = typeOfHamburger;
        extraIngredients = new ArrayList<>();
    }
    public enum TypeOfHamburger {
        CHICKEN, MEAL, PIG, VEGETABLE, OTHER
    }

    public TypeOfHamburger getTypeOfHamburger() {
        return typeOfHamburger;
    }

    public List<Item> getExtraIngredients() {
        return extraIngredients;
    }

    @Override
    public boolean addIngredient(Item item) {
        return extraIngredients.add(item);
    }

    @Override
    public boolean removeIngredient(Item item) {
        return extraIngredients.remove(item);
    }

    @Override
    public void removeAllIngredients() {
        extraIngredients.clear();
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "typeOfHamburger=" + typeOfHamburger +
                ", extraIngredients=" + extraIngredients +
                "} " + super.toString();
    }
}
