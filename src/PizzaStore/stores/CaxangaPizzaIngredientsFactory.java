package PizzaStore.stores;

import PizzaStore.ingredients.*;
import PizzaStore.ingredients.interfaces.*;
import PizzaStore.pizzas.PizzaIngredientFactory;

public class CaxangaPizzaIngredientsFactory implements PizzaIngredientFactory {

	public CaxangaPizzaIngredientsFactory() {
	}

	@Override
	public IDough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public ISauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public ICheese createCheese() {
		return new MozarellaCheese();
	}

	@Override
	public IVeggies[] createVeggies() {
		IVeggies[] veggies = new IVeggies[] { new BlackOlives(), new Spinach(), new Eggplant() };
		return veggies;
	}

	@Override
	public IPepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public IClams createClams() {
		return new FrozenClams();
	}

}
