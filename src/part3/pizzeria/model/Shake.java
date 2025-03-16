package part3.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class Shake extends Drink implements IExtraIngredient{
    final private TypeOfMilk typeOfMilk;
    final private List<Item> extraIngredients;

    public enum TypeOfMilk {
        WHOLE_MILK, LACTOSE_FREE, OAT_MILK
    }

    public TypeOfMilk getTypeOfMilk() {
        return typeOfMilk;
    }

    public Shake(int id, String name, float price, float volume, TypeOfMilk typeOfMilk) {
        super(id, name, price, volume);
        this.typeOfMilk = typeOfMilk;
        extraIngredients = new ArrayList<>();
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
        return "Shake{" +
                "typeOfMilk=" + typeOfMilk +
                ", extraIngredients=" + extraIngredients +
                "} " + super.toString();
    }
}
