package model;

import interfaces.Pizza;
import interfaces.PizzaStore;
import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.PepperoniPizza;
import pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {

		Object pizza = null;
		ChicagoPizzaIngredientsFactory ingredientFactory = new ChicagoPizzaIngredientsFactory();

		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			((Pizza) pizza).setName("Chicago Style Cheese Pizza");
		} else if (item.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			((Pizza) pizza).setName("Chicago Style Veggie Pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			((Pizza) pizza).setName("Chicago Style Clam Pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			((Pizza) pizza).setName("Chicago Style Pepperoni Pizza");
		}

		return (Pizza) pizza;
	}
}
