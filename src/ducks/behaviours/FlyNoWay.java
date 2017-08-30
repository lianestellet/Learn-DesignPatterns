package ducks.behaviours;

import ducks.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    public String fly() {
        return "I can't fly!";
    }
}
