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
	public double cost() {
		 
		return .1 + beverage.cost();
	}

}
