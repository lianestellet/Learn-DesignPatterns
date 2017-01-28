package beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "Dark Roast";
		this.size = Size.TALL;
	}

	public DarkRoast(Size size) {
		this.description = "Dark Roast";
		this.size = size;
	}

	public double cost() {
		double cost = 0;
		
		switch (super.getSize()) {
		case TALL:			cost += 0.99;			break;
		case GRANDE:		cost += 1.09;			break;
		case VENTI:			cost += 1.19;			break;
		}
		return cost;
	}

}
