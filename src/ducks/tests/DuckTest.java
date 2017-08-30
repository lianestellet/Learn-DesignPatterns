package ducks.tests;

import ducks.behaviours.FlyWithRocket;
import ducks.duck.*;
import org.junit.Assert;
import org.junit.Test;
import ducks.duck.MallardDuck;
import ducks.duck.MiniDuck;
import ducks.duck.ModelDuck;
import ducks.duck.RubberDuck;

public class DuckTest {

    @Test
    public void MallardDuckFlyTest(){
        MallardDuck mallard = new MallardDuck();
        Assert.assertEquals("I am a Mallard Duck!", mallard.display());
        Assert.assertEquals("I'm flying!!", mallard.performFly());
    }

    @Test
    public void MallardDuckQuackTest(){
        MallardDuck mallard = new MallardDuck();
        Assert.assertEquals("I am a Mallard Duck!", mallard.display());
        Assert.assertEquals("Quack!", mallard.performQuack());
    }

    @Test
    public void MiniDuckTest(){
        MiniDuck mini = new MiniDuck();
        Assert.assertEquals("I am a Mini Duck!", mini.display());
        Assert.assertEquals("Quack!", mini.performQuack());
        Assert.assertEquals("I can't fly!", mini.performFly());
    }

    @Test
    public void ModelDuckTest(){
        ModelDuck model = new ModelDuck();
        Assert.assertEquals("I am a Model Duck!", model.display());
        Assert.assertEquals("(Silence)", model.performQuack());
        Assert.assertEquals("I can't fly!", model.performFly());
    }

    @Test
    public void RubberDuckWithRocketsTest(){
        RubberDuck rubber = new RubberDuck();
        Assert.assertEquals("I am a Rubber Duck!", rubber.display());
        Assert.assertEquals("I can't fly!", rubber.performFly());

        rubber.setFlyBehaviour(new FlyWithRocket());
        Assert.assertEquals("Flying with rockets!", rubber.performFly());
    }



}
