package part3.pizzeria.model;

import java.util.List;

public interface IExtraIngredient {
    boolean addIngredient(Item item);
    boolean removeIngredient(Item item);
    void removeAllIngredients();
}
