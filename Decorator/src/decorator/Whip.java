package decorator;

import beverage.Beverage;

public class Whip extends CondimentDecorator {

	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public Size getSize() {
		return this.beverage.getSize();
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL) {
			cost += .11;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost += .12;
		} else if (beverage.getSize() == Size.VENTI) {
			cost += .23;
		}
		return cost;
	}

}
