package StarbuzzCoffee.beverage;

public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        double cost = 0;
        if (getSize() == Size.TALL) {
            cost += 1.99;
        } else if (getSize() == Size.GRANDE) {
            cost += 2.09;
        } else if (getSize() == Size.VENTI) {
            cost += 2.20;
        }
        return cost;
    }
}
