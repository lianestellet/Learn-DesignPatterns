package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import beverage.*;
import decorator.*;

public class BeverageOrderTest {
	
	/*|       BEVERAGES                 |             CONDIMENTS	   | 
	    House Blend     -   0.89		| 		Steamed Milk    -   .1
		Dark Roast	    -	0.99		|		Mocha   		-	.2
		Decaf		    -	1.05		|		Soy		     	-   .15
		Espresso      	-	1.99		|		Whip			-   .1		
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
		assertEquals(darkRoast.cost(), 1.09, 0);
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
		assertEquals(houseBlend.cost(), 1.64, 0);
	}
}
