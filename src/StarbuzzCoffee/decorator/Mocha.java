package StarbuzzCoffee.decorator;

import StarbuzzCoffee.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += .20;
        } else if (getSize() == Size.GRANDE) {
            cost += .30;
        } else if (getSize() == Size.VENTI) {
            cost += .40;
        }
        return cost;
    }
}
