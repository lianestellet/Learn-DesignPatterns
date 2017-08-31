package test;

import ducks.behaviours.FlyWithRocket;
import ducks.behaviours.QuackSqueak;
import ducks.duck.*;
import org.junit.Assert;
import org.junit.Test;

public class DuckTest {

    @Test
    public void ModelRubberMallardAndMiniDucksDisplaysTest(){
        ModelDuck model = new ModelDuck();
        RubberDuck rubber = new RubberDuck();
        MallardDuck mallard = new MallardDuck();
        MiniDuck mini = new MiniDuck();

        Assert.assertEquals("I am a Mallard Duck!", mallard.display());
        Assert.assertEquals("I am a Mini Duck!", mini.display());
        Assert.assertEquals("I am a Model Duck!", model.display());
        Assert.assertEquals("I am a Rubber Duck!", rubber.display());
    }

    @Test
    public void MallardDuckFlyBehaviourTest(){
        MallardDuck mallard = new MallardDuck();
        Assert.assertEquals("I'm flying!!", mallard.performFly());
    }

    @Test
    public void MallardDuckQuackBehaviourTest(){
        MallardDuck mallard = new MallardDuck();
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
    public void RubberDuckChangeFlyBehaviourNoFlyToFlyWithRocketsTest(){
        RubberDuck rubber = new RubberDuck();
        Assert.assertEquals("I can't fly!", rubber.performFly());

        rubber.setFlyBehaviour(new FlyWithRocket());
        Assert.assertEquals("Flying with rockets!", rubber.performFly());
    }

    @Test
    public void ModelDuckChangeQuackBehaviourSilenceToSqueakTest(){
        ModelDuck model = new ModelDuck();
        Assert.assertEquals("(Silence)", model.performQuack());

        model.setQuackBehaviour(new QuackSqueak());
        Assert.assertEquals("Squeak!", model.performQuack());
    }
}
