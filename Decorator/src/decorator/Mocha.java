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
		
		switch (beverage.getSize()) {
		case TALL:			cost += .2;			break;
		case GRANDE:		cost += .3;			break;
		case VENTI:			cost += .4;			break;
		}
		return cost;
	}

}