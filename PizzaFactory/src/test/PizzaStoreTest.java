package test;

import static org.junit.Assert.*;

import org.junit.Test;

import interfaces.PizzaStore;
import model.NYPizzaStore;

public class PizzaStoreTest {

	@Test
	public void NYPizzaOrderTest() {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		nyPizzaStore.orderPizza("Cheese");
		fail("Not yet implemented");
	}

}
