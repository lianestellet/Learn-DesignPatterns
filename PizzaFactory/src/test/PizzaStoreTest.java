package test;

import static org.junit.Assert.*;

import org.junit.Test;

import stores.NyPizzaStore;
import stores.PizzaStore;

public class PizzaStoreTest {

	@Test
	public void NYPizzaOrderTest() {
		PizzaStore nyPizzaStore = new NyPizzaStore();
		nyPizzaStore.orderPizza("Cheese");
		fail("Not yet implemented");
	}

}
