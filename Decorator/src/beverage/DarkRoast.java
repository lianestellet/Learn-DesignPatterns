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
		if (super.getSize() == Size.TALL) {
			cost += .99;
		} else if (super.getSize() == Size.GRANDE) {
			cost += 1.09;
		} else if (super.getSize() == Size.VENTI) {
			cost += 1.19;
		}
		return cost;
	}

}
