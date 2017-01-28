package decorator;

import beverage.Beverage;

public class SteamedMilk extends CondimentDecorator {

	Beverage beverage;

	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
	}

	@Override
	public Size getSize() {
		return this.beverage.getSize();
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		
		switch (beverage.getSize()) {
		case TALL:			cost += .15;			break;
		case GRANDE:		cost += .15;			break;
		case VENTI:			cost += .15;			break;
		}
		return cost;
	}

}
