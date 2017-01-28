package stores;

import pizza.NYStyleCheesePizza;
import pizza.NYStyleClamPizza;
import pizza.NYStylePepperoniPizza;
import pizza.NYStyleVeggiePizza;
import pizza.Pizza;

public class NyPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else
			return null;
	}

}
