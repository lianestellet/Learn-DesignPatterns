package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import beverage.*;
import beverage.Beverage.Size;
import decorator.*;

public class BeverageOrderTest {
	
	/*|       BEVERAGES       T  |  G  |  V  |        CONDIMENTS	     T  |  G |  V |
	    House Blend     -   0.89 |0.99 |1.15 |		Steamed Milk    -   .15 |.15 |.15 |
		Dark Roast	    -	0.99 |1.09 |1.19 |		Mocha   		-	.20 |.30 |.40 |
		Decaf		    -	1.05 |1.25 |1.45 |		Soy		     	-   .10 |.15 |.20 |
		Espresso      	-	1.99 |2.29 |2.49 |		Whip			-   .11	|.12 |.13 |
	 */
		
	@Test
	public void BeverageDefaultSizeWithoutCondimentsTest() {
		Beverage darkRoast = new DarkRoast(Size.VENTI); //another way to change size
		assertEquals("Venti Dark Roast", darkRoast.getDescription());		
		assertEquals(1.19, darkRoast.cost(), 0);		
	}
	
	@Test
	public void BeverageDefaultSizeWithOneCondimentsTest(){
		Beverage darkRoast = new DarkRoast();
		darkRoast = new SteamedMilk(darkRoast);
		assertEquals("Tall Dark Roast, Steamed Milk", darkRoast.getDescription());		
		assertEquals(1.14, darkRoast.cost(), 0);
	}
	
	@Test
	public void BeverageDefaultSizeWithThreeDifferentCondimentsTest(){
		Beverage decaf = new Decaf();
		decaf = new SteamedMilk(decaf);
		decaf = new Soy(decaf);
		decaf = new Mocha(decaf);
		assertEquals("Tall Decaf, Steamed Milk, Soy, Mocha", decaf.getDescription());		
		assertEquals(1.50, decaf.cost(), 0.001);
	}
	
	@Test
	public void BeverageDefaultSizeWithRepeatedCondimentsTest(){
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Whip(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Soy(houseBlend);
		houseBlend = new Whip(houseBlend);
		
		assertEquals("Tall House Blend Coffee, Whip, Mocha, Mocha, Soy, Whip", houseBlend.getDescription());		
		assertEquals(1.61, houseBlend.cost(), 0);
	}

	@Test
	public void BeverageChangeSizeTest() {
		Beverage espresso = new Espresso();
		espresso.setSize(Size.GRANDE);
		assertEquals("Grande Espresso", espresso.getDescription());		
		assertEquals(2.29, espresso.cost(), 0);		
	}
	
	@Test
	public void BeverageDoubleChangeSizeAddTwoCondimentsTest() {
		Beverage espresso = new Espresso(Size.GRANDE);
		espresso.setSize(Size.VENTI);
		espresso = new Mocha(espresso);
		espresso = new Soy(espresso);
		assertEquals("Venti Espresso, Mocha, Soy", espresso.getDescription());		
		assertEquals(3.09, espresso.cost(), 0.001);		
	}
	
	@Test
	public void BeverageSizeChangeAfterCondimentsTest() {
		Beverage espresso = new Espresso(Size.TALL);
		espresso = new Mocha(espresso);
		espresso.setSize(Size.GRANDE);
		espresso = new Soy(espresso);
		assertEquals("Tall Espresso, Mocha, Soy", espresso.getDescription());		
		assertEquals(2.29, espresso.cost(), 0.001);
		
		//This is what I expected first, then I learned how he deals with references nicely!!
		//assertEquals("Grande Espresso, Mocha, Soy", espresso.getDescription());		
		//assertEquals(2.74, espresso.cost(), 0.001);		
	}
}
