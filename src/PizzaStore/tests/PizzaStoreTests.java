package PizzaStore.tests;


import PizzaStore.stores.BoaViagemPizzaStore;
import PizzaStore.stores.CaxangaPizzaStore;
import PizzaStore.stores.OlindaPizzaStore;
import org.junit.Before;
import org.junit.Test;
import PizzaStore.stores.PizzaStore;

public class PizzaStoreTests {

    PizzaStore boaViagem;
    PizzaStore caxanga;
    PizzaStore olinda;

    //TODO: will implement prices, pizza border and additional ingredients at future.

    @Before
    public void setup(){
        boaViagem = new BoaViagemPizzaStore();
        caxanga = new CaxangaPizzaStore();
        olinda = new OlindaPizzaStore();
    }

    @Test
    public void PizzaStoresShouldCreateItOwnsPizzasStylesTest(){

    }

    public void BoaViagemCheesePizzaShouldHave(){

    }

}
