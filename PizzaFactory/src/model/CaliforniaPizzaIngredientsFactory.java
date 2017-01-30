package model;

import ingredients.FreshClams;
import ingredients.Garlic;
import ingredients.MarinaraSauce;
import ingredients.Onion;
import ingredients.ParmesanCheese;
import ingredients.RedPepper;
import ingredients.SlicedPepperoni;
import ingredients.Spinach;
import ingredients.ThickCrustDough;
import interfaces.Cheese;
import interfaces.Clams;
import interfaces.Dough;
import interfaces.Pepperoni;
import interfaces.PizzaIngredientFactory;
import interfaces.Veggies;

public class CaliforniaPizzaIngredientsFactory implements PizzaIngredientFactory {

	public CaliforniaPizzaIngredientsFactory() {
	}

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ParmesanCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new RedPepper(), new Spinach(), new Onion() };
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
