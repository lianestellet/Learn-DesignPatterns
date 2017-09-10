package Ducks.behaviours;

import Ducks.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    public String fly() {
        return "I can't fly!";
    }
}
