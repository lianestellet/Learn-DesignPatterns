package ducks.behaviours;

import ducks.interfaces.FlyBehaviour;

public class FlyWithRocket implements FlyBehaviour {
    public String fly() {
        return "Flying with rockets!";
    }
}
