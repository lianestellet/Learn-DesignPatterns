package beverage;

public class Espresso extends Beverage {

	public Espresso() {
		this.description = "Espresso";
		this.size = Size.TALL;
	}

	public Espresso(Size size) {
		this.description = "Espresso";
		this.size = size;
	}

	public double cost() {
		double cost = 0;
		
		switch (super.getSize()) {
		case TALL:			cost += 1.99;			break;
		case GRANDE:		cost += 2.29;			break;
		case VENTI:			cost += 2.49;			break;
		}
		return cost;
	}

}
