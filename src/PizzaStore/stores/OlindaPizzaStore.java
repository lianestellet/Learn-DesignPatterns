package PizzaStore.stores;

import PizzaStore.pizzas.Pizza;
import PizzaStore.pizzas.CheesePizza;
import PizzaStore.pizzas.ClamPizza;
import PizzaStore.pizzas.PepperoniPizza;
import PizzaStore.pizzas.VeggiePizza;

public class OlindaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {

		Pizza pizza = null;
		OlindaPizzaIngredientsFactory ingredientFactory = new OlindaPizzaIngredientsFactory();

		if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            ((Pizza)pizza).setName("Olinda Style ICheese Pizza");
        } else if(item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            ((Pizza)pizza).setName("Olinda Style Veggie Pizza");
        } else if(item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            ((Pizza)pizza).setName("Olinda Style Clam Pizza");
        } else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            ((Pizza)pizza).setName("Olinda Style IPepperoni Pizza");
        }
		
		return pizza;
	}

}
