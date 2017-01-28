package test;

import stores.ChicagoPizzaStore;
import stores.NyPizzaStore;
import stores.PizzaStore;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NyPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
	}
}
