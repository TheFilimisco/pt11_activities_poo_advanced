package part3.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerStore {
    final private List<Item> itemsStore;

    public ManagerStore() {
        itemsStore = new ArrayList<>();
    }

    public List<Item> getItemsStore() {
        return itemsStore;
    }

    public boolean addItem(Item item) {
        return itemsStore.add(item);
    }

    public boolean updateItem(int id, Item item) {
        var getItem = getItem(id);
        if (getItem != null) {
            itemsStore.set(itemsStore.indexOf(getItem),item);
            return true;
        }
        return false;
    }

    public boolean removeItem(Item item) {
        return itemsStore.remove(item);
    }

    public Item getItem(int id) {
        return itemsStore.stream().filter(
                item -> item.getId() == id
        ).findFirst().orElse(null);
    }

    public List<Item> getAllItems() {
        return itemsStore;
    }

    public List<Item> getAllExtraItems() {
        List<Item> items = new ArrayList<>();
        itemsStore.forEach(item -> {
            if (item instanceof Hamburger) {
                ((Hamburger) item).getExtraIngredients().forEach(extraIngredient -> {
                    items.add(extraIngredient);
                });
            }
            if (item instanceof Shake) {
                ((Shake) item).getExtraIngredients().forEach(extraIngredient -> {
                    items.add(extraIngredient);
                });
            }
        });
        return items;
    }

}
