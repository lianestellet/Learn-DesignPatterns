package test;

import beverage.Beverage;
import beverage.DarkRoast;
import beverage.Espresso;
import beverage.HouseBlend;
import decorator.Mocha;
import decorator.Soy;
import decorator.Whip;

public class StarbuzzCoffee {

	Beverage beverage;

	public StarbuzzCoffee(Beverage beverage) {
		this.beverage = beverage;
	}

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}	

	/*public Beverage BeverageOrder(ArrayList<CondimentDecorator> condiments) throws InstantiationException,
			IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException {

		if (condiments.size() > 0) {
			for (CondimentDecorator condiment : condiments) {
				this.beverage = (Beverage) condiment.getClass().getDeclaredConstructor(Beverage.class)
						.newInstance(beverage);
			}
		}

		return this.beverage;
	}*/
}
