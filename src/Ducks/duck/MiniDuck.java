package Ducks.duck;

import Ducks.behaviours.FlyNoWay;
import Ducks.behaviours.Quack;

public class MiniDuck extends Duck {

    public MiniDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }

    public String display(){
        return "I am a Mini Duck!";
    }

}
