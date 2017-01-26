package decorator;

import beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
	
	public abstract Size getSize();
}
