package model;

import interfaces.Pizza;
import interfaces.PizzaStore;
import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.PepperoniPizza;
import pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {

		Pizza pizza = null;
		NYPizzaIngredientsFactory ingredientFactory = new NYPizzaIngredientsFactory();

		if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            ((Pizza)pizza).setName("New York Style Cheese Pizza");
        } else if(item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            ((Pizza)pizza).setName("New York Style Veggie Pizza");
        } else if(item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            ((Pizza)pizza).setName("New York Style Clam Pizza");
        } else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            ((Pizza)pizza).setName("New York Style Pepperoni Pizza");
        }
		
		return pizza;
	}

}
