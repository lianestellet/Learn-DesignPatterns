package beverage;

public class Decaf extends Beverage {

	public Decaf() {
		this.description = "Decaf";
		this.size = Size.TALL;
	}

	public Decaf(Size size) {
		this.description = "Decaf";
		this.size = size;
	}

	@Override
	public double cost() {
		double cost = 0;
		switch (super.getSize()) {
		case TALL:			cost += 1.05;			break;
		case GRANDE:		cost += 1.25;			break;
		case VENTI:			cost += 1.45;			break;
		}
		return cost;
	}

}
