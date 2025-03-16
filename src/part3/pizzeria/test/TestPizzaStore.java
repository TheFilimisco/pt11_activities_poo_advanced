package part3.pizzeria.test;

import part3.pizzeria.model.*;

public class TestPizzaStore {
    public static void main(String[] args) {
        Food tomato = new Food(1,"Tomato",1.20f,200.0f);
        Food cheese = new Food(2,"Cheese",1.20f,200.0f);
        Food apple = new Food(3,"Apple",1.20f,200.0f);
        Food orange = new Food(4,"Orange",1.20f,200.0f);

        Drink water = new Drink(5,"Water",1.20f,100.0f);
        Drink milk = new Drink(6,"Milk",1.20f,100.0f);
        Drink beer = new Drink(7,"Beer",1.20f,100.0f);

        Hamburger megaBurger = new Hamburger(8, "MegaBurger", 10, 300, Hamburger.TypeOfHamburger.MEAL);
        megaBurger.addIngredient(tomato);
        megaBurger.addIngredient(cheese);
        megaBurger.addIngredient(apple);
        megaBurger.addIngredient(orange);


        Hamburger vegetarianBurger = new Hamburger(9, "VegetarianBurger", 7, 300, Hamburger.TypeOfHamburger.VEGETABLE);
        Pizza peperoniPizza = new Pizza(10,"Peperoni", 5,100, Pizza.Size.X_LARGE);

        Shake chocoShake = new Shake(11, "Choclate", 4, 100, Shake.TypeOfMilk.OAT_MILK);
        chocoShake.addIngredient(apple);
        chocoShake.addIngredient(apple);
        chocoShake.addIngredient(orange);



        ManagerStore managerStore = new ManagerStore();

        //Add new Items
        managerStore.addItem(megaBurger);
        managerStore.addItem(vegetarianBurger);
        managerStore.addItem(peperoniPizza);
        managerStore.addItem(chocoShake);

        managerStore.getAllItems().forEach(item -> System.out.println(item.toString()));


        //update Item
        System.out.println(" ");
        managerStore.updateItem(8, vegetarianBurger);

        //get All Items
        managerStore.getAllItems().forEach(item -> System.out.println(item.toString()));

        //Delete Item
        managerStore.removeItem(chocoShake);
        System.out.println(" ");
        managerStore.getAllItems().forEach(item -> System.out.println(item.toString()));

        //Get Item
        System.out.println(" ");
        System.out.println(managerStore.getItem(10));

        System.out.println("XD");

        managerStore.addItem(megaBurger);
        managerStore.addItem(vegetarianBurger);

        //Get Extra Ingredients
        managerStore.getAllExtraItems().forEach(System.out::println);

    }
}
