package PizzaStore.stores;

import PizzaStore.pizzas.Pizza;
import PizzaStore.pizzas.CheesePizza;
import PizzaStore.pizzas.ClamPizza;
import PizzaStore.pizzas.PepperoniPizza;
import PizzaStore.pizzas.VeggiePizza;

public class CaxangaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {

		Object pizza = null;
		CaxangaPizzaIngredientsFactory ingredientFactory = new CaxangaPizzaIngredientsFactory();

		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			((Pizza) pizza).setName("Caxanga Style ICheese Pizza");
		} else if (item.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			((Pizza) pizza).setName("Caxanga Style Veggie Pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			((Pizza) pizza).setName("Caxanga Style Clam Pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			((Pizza) pizza).setName("Caxanga Style IPepperoni Pizza");
		}

		return (Pizza) pizza;
	}
}
