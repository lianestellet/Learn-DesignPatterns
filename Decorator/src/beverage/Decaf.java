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
		if (super.getSize() == Size.TALL) {
			cost += 1.05;
		} else if (super.getSize() == Size.GRANDE) {
			cost += 1.25;
		} else if (super.getSize() == Size.VENTI) {
			cost += 1.45;
		}
		return cost;
	}

}
