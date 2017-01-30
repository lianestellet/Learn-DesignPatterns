package model;

import interfaces.Cheese;
import interfaces.Clams;
import interfaces.Dough;
import interfaces.Pepperoni;
import interfaces.Pizza;
import interfaces.PizzaIngredientFactory;
import interfaces.PizzaStore;
import interfaces.Veggies;
import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.PepperoniPizza;
import pizza.VeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore implements PizzaIngredientFactory{

	@Override
	protected Pizza createPizza(String item) {
		
		Object pizza = null;
        CaliforniaPizzaIngredientsFactory ingredientFactory = new CaliforniaPizzaIngredientsFactory();
        
        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            ((Pizza)pizza).setName("California Style Cheese Pizza");
        } else if(item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            ((Pizza)pizza).setName("California Style Veggie Pizza");
        } else if(item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            ((Pizza)pizza).setName("California Style Clam Pizza");
        } else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            ((Pizza)pizza).setName("California Style Pepperoni Pizza");
        }
		
		return (Pizza) pizza;
	}

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return null;
	}

}
