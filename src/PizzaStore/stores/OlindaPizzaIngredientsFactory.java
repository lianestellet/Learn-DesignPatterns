package PizzaStore.stores;

import PizzaStore.ingredients.*;
import PizzaStore.ingredients.interfaces.*;
import PizzaStore.pizzas.PizzaIngredientFactory;

public class OlindaPizzaIngredientsFactory implements PizzaIngredientFactory {

	public OlindaPizzaIngredientsFactory() {
	}

	@Override
	public IDough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public ISauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public ICheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public IVeggies[] createVeggies() {
		IVeggies[] veggies = new IVeggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
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
