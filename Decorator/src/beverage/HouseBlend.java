package beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "House Blend Coffee";
		this.size = Size.TALL;
	}
	
	public HouseBlend(Size size) {
		this.description = "House Blend Coffee";
		this.size = size;
	}

	public double cost() {
		double cost = 0;
		if (super.getSize() == Size.TALL) {
			cost += .89;
		} else if (super.getSize() == Size.GRANDE) {
			cost += .99;
		} else if (super.getSize() == Size.VENTI) {
			cost += 1.15;
		}
		return cost;
	}

}
