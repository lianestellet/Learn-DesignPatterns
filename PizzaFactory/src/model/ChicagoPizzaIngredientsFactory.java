package model;

import ingredients.BlackOlives;
import ingredients.Eggplant;
import ingredients.FrozenClams;
import ingredients.Garlic;
import ingredients.MarinaraSauce;
import ingredients.MozarellaCheese;
import ingredients.Mushroom;
import ingredients.Onion;
import ingredients.PlumTomatoSauce;
import ingredients.RedPepper;
import ingredients.ReggianoCheese;
import ingredients.SlicedPepperoni;
import ingredients.Spinach;
import ingredients.ThickCrustDough;
import ingredients.ThinCrustDough;
import interfaces.Cheese;
import interfaces.Clams;
import interfaces.Dough;
import interfaces.Pepperoni;
import interfaces.PizzaIngredientFactory;
import interfaces.Veggies;

public class ChicagoPizzaIngredientsFactory implements PizzaIngredientFactory {

	public ChicagoPizzaIngredientsFactory() {
	}

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = new Veggies[] { new BlackOlives(), new Spinach(), new Eggplant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
