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
		if (super.getSize() == Size.TALL) {
			cost += 1.99;
		} else if (super.getSize() == Size.GRANDE) {
			cost += 2.29;
		} else if (super.getSize() == Size.VENTI) {
			cost += 2.49;
		}
		return cost;
	}

}
