package Ducks.duck;

import Ducks.behaviours.FlyWithWings;
import Ducks.behaviours.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public String display(){
        return "I am a Mallard Duck!";
    }

}
