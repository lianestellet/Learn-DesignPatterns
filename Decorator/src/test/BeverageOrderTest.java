package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

import beverage.*;
import decorator.*;

public class BeverageOrderTest {
	
	/*  House Blend     -   0.89
		Dark Roast	    -	0.99
		Decaf		    -	1.05
		Espresso      	-	1.99
		
		Steamed Milk    -   .1
		Mocha   		-	.2
		Soy		     	-   .15
		Whip			-   .1
	 */

	@Test
	public void BeverageWithoutCondimentsTest() throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException {
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
	
	

	

}
