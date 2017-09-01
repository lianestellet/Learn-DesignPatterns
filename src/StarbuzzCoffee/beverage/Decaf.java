package StarbuzzCoffee.beverage;

public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        double cost = 0;
        if (getSize() == Size.TALL) {
            cost += 1.25;
        } else if (getSize() == Size.GRANDE) {
            cost += 1.50;
        } else if (getSize() == Size.VENTI) {
            cost += 1.75;
        }
        return cost;
    }
}