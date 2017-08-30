package ducks.duck;

import ducks.behaviours.FlyNoWay;
import ducks.behaviours.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }

    public String display() {
        return "I am a Model Duck!";
    }
}
