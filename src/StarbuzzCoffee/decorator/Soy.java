package StarbuzzCoffee.decorator;

import StarbuzzCoffee.beverage.Beverage;

public class Soy extends  CondimentDecorator {

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += .15;
        } else if (getSize() == Size.GRANDE) {
            cost += .25;
        } else if (getSize() == Size.VENTI) {
            cost += .30;
        }
        return cost;
    }
}
