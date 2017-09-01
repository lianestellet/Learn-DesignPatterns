package StarbuzzCoffee.decorator;

import StarbuzzCoffee.beverage.Beverage;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += .10;
        } else if (getSize() == Size.GRANDE) {
            cost += .15;
        } else if (getSize() == Size.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
