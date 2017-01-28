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
		
		switch (beverage.getSize()) {
		case TALL:			cost += .11;			break;
		case GRANDE:		cost += .12;			break;
		case VENTI:			cost += .13;			break;
		}
		return cost;
	}

}
