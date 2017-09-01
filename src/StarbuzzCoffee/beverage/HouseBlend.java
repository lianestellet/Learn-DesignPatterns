package StarbuzzCoffee.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        double cost = 0;
        if (getSize() == Size.TALL) {
            cost += .89;
        } else if (getSize() == Size.GRANDE) {
            cost += 1.09;
        } else if (getSize() == Size.VENTI) {
            cost += 1.20;
        }
        return cost;
    }
}