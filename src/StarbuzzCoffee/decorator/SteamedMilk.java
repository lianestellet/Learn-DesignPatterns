package StarbuzzCoffee.decorator;

import StarbuzzCoffee.beverage.Beverage;

public class SteamedMilk extends  CondimentDecorator {

    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
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
