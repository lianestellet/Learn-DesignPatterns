package model;

import ingredients.FreshClams;
import ingredients.Garlic;
import ingredients.MarinaraSauce;
import ingredients.Mushroom;
import ingredients.Onion;
import ingredients.RedPepper;
import ingredients.ReggianoCheese;
import ingredients.SlicedPepperoni;
import ingredients.ThinCrustDough;
import interfaces.Cheese;
import interfaces.Clams;
import interfaces.Dough;
import interfaces.Pepperoni;
import interfaces.PizzaIngredientFactory;
import interfaces.Veggies;

public class NYPizzaIngredientsFactory implements PizzaIngredientFactory {

	public NYPizzaIngredientsFactory() {
	}

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = new Veggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}
}
