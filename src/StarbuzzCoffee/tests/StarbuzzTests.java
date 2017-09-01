package StarbuzzCoffee.tests;

import StarbuzzCoffee.beverage.*;
import StarbuzzCoffee.decorator.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StarbuzzTests {

    Beverage espresso;
    Beverage darkRoast;
    Beverage decaf;
    Beverage houseBlend;

    @Before
    public void setup(){
        espresso = new Espresso();
        darkRoast = new DarkRoast();
        decaf = new Decaf();
        houseBlend = new HouseBlend();
    }

    /*
     House Blend       0.89 | 1.09 | 1.20
     Dark Roast          0.79 | 0.99 | 1.19
     Decaf                  1.25 | 1.50 | 1.75
     Espresso             1.99 | 2.09 | 2.20
     Steamed Milk    0.10 | 0.15 | 0.20
     Mocha               0.20 | 0.30 | 0.40
     Soy                     0.15 | 0.25 | 0.30
     Whip                  0.10 | 0.15 | 0.20
     */



    @Test
    public void simpleBeveragesDescriptionsTest(){
        Assert.assertEquals("House Blend Coffee", houseBlend.getDescription());
        Assert.assertEquals("Dark Roast Coffee", darkRoast.getDescription());
        Assert.assertEquals("Decaf Coffee", decaf.getDescription());
        Assert.assertEquals("Espresso", espresso.getDescription());

    }

    @Test
    public void simpleBeveragesPricesTest(){
        Assert.assertEquals(0.89, houseBlend.cost(), 0.001);
        Assert.assertEquals(0.79, darkRoast.cost(), 0.001);
        Assert.assertEquals(1.25, decaf.cost(), 0.001);
        Assert.assertEquals(1.99, espresso.cost(), 0.001);
    }

    @Test
    public void espressoWithDecoratorsShouldChangeDescriptionsTest(){
        espresso = new Mocha(espresso);
        Assert.assertEquals("Espresso, Mocha", espresso.getDescription());

        espresso = new Whip(espresso);
        Assert.assertEquals("Espresso, Mocha, Whip", espresso.getDescription());
    }

    @Test
    public void decafWithDecoratorsShouldIncreaseCostTest(){
        decaf = new Soy(decaf);
        Assert.assertEquals(1.40, decaf.cost(), 0.001);

        decaf = new SteamedMilk(decaf);
        Assert.assertEquals(1.5, decaf.cost(), 0.001);
    }

    @Test
    public void coffeeSizeShouldAffectPricesTest(){

        houseBlend.setSize(Beverage.Size.TALL); ;
        darkRoast.setSize(Beverage.Size.GRANDE);
        decaf.setSize(Beverage.Size.VENTI); ;

        Assert.assertEquals(0.89, houseBlend.cost(), 0.001);
        Assert.assertEquals(0.99, darkRoast.cost(), 0.001);
        Assert.assertEquals(1.75, decaf.cost(), 0.001);

    }

    @Test
    public  void coffeeDecoratorsShouldAffectPricesTest(){

        espresso.setSize(Beverage.Size.GRANDE); ;
        darkRoast.setSize(Beverage.Size.VENTI);

        espresso = new SteamedMilk(espresso);
        Assert.assertEquals(2.24, espresso.cost(), 0.001);
        espresso = new Whip(espresso);
        Assert.assertEquals(2.39, espresso.cost(), 0.001);

        darkRoast = new Mocha(darkRoast);
        Assert.assertEquals(1.59, darkRoast.cost(), 0.001);
        darkRoast = new Soy(darkRoast);
        Assert.assertEquals(1.89, darkRoast.cost(), 0.001);


    }
}
