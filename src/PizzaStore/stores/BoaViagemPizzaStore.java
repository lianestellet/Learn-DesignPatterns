package PizzaStore.stores;

import PizzaStore.pizzas.*;

public class BoaViagemPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		
		Object pizza = null;
        BoaViagemPizzaIngredientsFactory ingredientFactory = new BoaViagemPizzaIngredientsFactory();
        
        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            ((Pizza)pizza).setName("Boa Viagem Style ICheese Pizza");
        } else if(item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            ((Pizza)pizza).setName("Boa Viagem Style Veggie Pizza");
        } else if(item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            ((Pizza)pizza).setName("Boa Viagem Style Clam Pizza");
        } else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            ((Pizza)pizza).setName("Boa Viagem Style IPepperoni Pizza");
        }
		
		return (Pizza) pizza;
	}
}
