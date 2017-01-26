package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import beverage.*;
import decorator.*;

public class BeverageOrderTest {
	
	/*|       BEVERAGES       T  |  G  |  V  |        CONDIMENTS	     T  |  G |  V |
	    House Blend     -   0.89 |0.99 |1.15 |		Steamed Milk    -   .15 |.15 |.15 |
		Dark Roast	    -	0.99 |1.09 |1.19 |		Mocha   		-	.20 |.30 |.40 |
		Decaf		    -	1.05 |1.25 |1.45 |		Soy		     	-   .10 |.15 |.20 |
		Espresso      	-	1.99 |2.29 |2.49 |		Whip			-   .11	|.12 |.13 |
	 */

	@Test
	public void BeverageWithoutCondimentsTest() {
		Beverage espresso = new Espresso();
		assertEquals("Espresso", espresso.getDescription());		
		assertTrue(espresso.cost() - 1.99 == 0);		
	}
	
	@Test
	public void BeverageWithOneCondimentsTest(){
		Beverage darkRoast = new DarkRoast();
		darkRoast = new SteamedMilk(darkRoast);
		assertEquals("Dark Roast, Steamed Milk", darkRoast.getDescription());		
		assertEquals(1.14, darkRoast.cost(), 0);
	}
	
	@Test
	public void BeverageWithThreeDifferentCondimentsTest(){
		Beverage decaf = new Decaf();
		decaf = new SteamedMilk(decaf);
		decaf = new Soy(decaf);
		decaf = new Mocha(decaf);
		assertEquals("Decaf, Steamed Milk, Soy, Mocha", decaf.getDescription());		
		assertEquals(decaf.cost(), 1.50, 0);
	}
	
	@Test
	public void BeverageWithRepeatedCondimentsTest(){
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Whip(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Soy(houseBlend);
		houseBlend = new Whip(houseBlend);
		
		assertEquals("House Blend Coffee, Whip, Mocha, Mocha, Soy, Whip", houseBlend.getDescription());		
		assertEquals(1.61, houseBlend.cost(), 0);
	}
}
