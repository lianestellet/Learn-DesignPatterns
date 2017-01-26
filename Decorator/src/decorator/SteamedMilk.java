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
		if (beverage.getSize() == Size.TALL) {	 				cost += .15;} 
		else if (beverage.getSize() == Size.GRANDE) {			cost += .15;} 
		else if (beverage.getSize() == Size.VENTI) {			cost += .15;}
		return cost;
	}

}
