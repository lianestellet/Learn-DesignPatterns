package StarbuzzCoffee.beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        double cost = 0;
        if (getSize() == Size.TALL) {
            cost += .79;
        } else if (getSize() == Size.GRANDE) {
            cost += .99;
        } else if (getSize() == Size.VENTI) {
            cost += 1.19;
        }
        return cost;
    }
}