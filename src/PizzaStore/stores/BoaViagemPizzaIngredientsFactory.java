package PizzaStore.stores;

import PizzaStore.ingredients.*;
import PizzaStore.ingredients.interfaces.*;
import PizzaStore.pizzas.PizzaIngredientFactory;

public class BoaViagemPizzaIngredientsFactory implements PizzaIngredientFactory {

	public BoaViagemPizzaIngredientsFactory() {
	}

	@Override
	public IDough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public ISauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public ICheese createCheese() {
		return new ParmesanCheese();
	}

	@Override
	public IVeggies[] createVeggies() {
		IVeggies veggies[] = { new Garlic(), new RedPepper(), new Spinach(), new Onion() };
		return veggies;
	}

	@Override
	public IPepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public IClams createClams() {
		return new FreshClams();
	}

}
