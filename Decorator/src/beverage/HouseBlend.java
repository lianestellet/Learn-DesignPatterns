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
		
		switch (super.getSize()) {
		case TALL:			cost += 0.89;			break;
		case GRANDE:		cost += 0.99;			break;
		case VENTI:			cost += 1.15;			break;
		}
		
		return cost;
	}

}
