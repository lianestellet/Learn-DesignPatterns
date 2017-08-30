package ducks.duck;

import ducks.behaviours.FlyWithWings;
import ducks.behaviours.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public String display(){
        return "I am a Mallard Duck!";
    }

}
