package Ducks.tests;

import Ducks.behaviours.FlyWithRocket;
import Ducks.behaviours.QuackSqueak;
import Ducks.duck.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DuckTest {

    private ModelDuck model ;
    private RubberDuck rubber ;
    private MallardDuck mallard ;
    private MiniDuck mini ;

    @Before
    public void setup(){
        model = new ModelDuck();
        rubber = new RubberDuck();
        mallard = new MallardDuck();
        mini = new MiniDuck();
    }

    @Test
    public void AllDucksDisplaysTest(){
        Assert.assertEquals("I am a Mallard Duck!", mallard.display());
        Assert.assertEquals("I am a Mini Duck!", mini.display());
        Assert.assertEquals("I am a Model Duck!", model.display());
        Assert.assertEquals("I am a Rubber Duck!", rubber.display());
    }

    @Test
    public void MallardDuckFlyBehaviourTest(){
        Assert.assertEquals("I'm flying!!", mallard.performFly());
    }

    @Test
    public void MallardDuckQuackBehaviourTest(){
        Assert.assertEquals("Quack!", mallard.performQuack());
    }

    @Test
    public void MiniDuckTest(){
        Assert.assertEquals("I am a Mini Duck!", mini.display());
        Assert.assertEquals("Quack!", mini.performQuack());
        Assert.assertEquals("I can't fly!", mini.performFly());
    }

    @Test
    public void ModelDuckTest(){
        Assert.assertEquals("I am a Model Duck!", model.display());
        Assert.assertEquals("(Silence)", model.performQuack());
        Assert.assertEquals("I can't fly!", model.performFly());
    }

    @Test
    public void RubberDuckChangeFlyBehaviourNoFlyToFlyWithRocketsTest(){
        Assert.assertEquals("I can't fly!", rubber.performFly());
        rubber.setFlyBehaviour(new FlyWithRocket());
        Assert.assertEquals("Flying with rockets!", rubber.performFly());
    }

    @Test
    public void ModelDuckChangeQuackBehaviourSilenceToSqueakTest(){
        Assert.assertEquals("(Silence)", model.performQuack());
        model.setQuackBehaviour(new QuackSqueak());
        Assert.assertEquals("Squeak!", model.performQuack());
    }

}
