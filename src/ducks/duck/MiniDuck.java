package ducks.duck;

import ducks.behaviours.FlyNoWay;
import ducks.behaviours.Quack;

public class MiniDuck extends Duck {

    public MiniDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }

    public String display(){
        return "I am a Mini Duck!";
    }

}
