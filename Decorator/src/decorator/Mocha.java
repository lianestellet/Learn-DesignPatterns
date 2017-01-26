package decorator;

import beverage.Beverage;

public class Mocha extends CondimentDecorator {

	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public Size getSize() {
		return this.beverage.getSize();
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL) {
			cost += .2;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost += .3;
		} else if (beverage.getSize() == Size.VENTI) {
			cost += .4;
		}
		return cost;
	}

}