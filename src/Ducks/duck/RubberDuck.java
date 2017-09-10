package Ducks.duck;

import Ducks.behaviours.FlyNoWay;
import Ducks.behaviours.QuackSqueak;

public class RubberDuck extends Duck{

    public RubberDuck(){
        quackBehaviour = new QuackSqueak();
        flyBehaviour = new FlyNoWay();
    }

    public String display() {
        return "I am a Rubber Duck!";
    }


}
