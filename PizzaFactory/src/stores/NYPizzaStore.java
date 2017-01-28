package stores;

import model.Pizza;
import model.PizzaStore;
import newYorkPizzaStyle.NYStyleCheesePizza;
import newYorkPizzaStyle.NYStyleClamPizza;
import newYorkPizzaStyle.NYStylePepperoniPizza;
import newYorkPizzaStyle.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

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
