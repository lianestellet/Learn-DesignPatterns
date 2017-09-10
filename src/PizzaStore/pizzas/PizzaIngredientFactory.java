package PizzaStore.pizzas;

import PizzaStore.ingredients.interfaces.*;

public interface PizzaIngredientFactory {
    public IDough createDough();
    public ISauce createSauce();
    public ICheese createCheese();
    public IVeggies[] createVeggies();
    public IPepperoni createPepperoni();
    public IClams createClams();
}
