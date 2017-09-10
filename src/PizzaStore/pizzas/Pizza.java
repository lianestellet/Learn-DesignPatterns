package PizzaStore.pizzas;

import PizzaStore.ingredients.interfaces.*;

public abstract class Pizza {

    public String name;
    public IDough dough;
    public ISauce sauce;
    public IVeggies veggies[];
    public ICheese cheese;
    public IPepperoni pepperoni;
    public IClams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
