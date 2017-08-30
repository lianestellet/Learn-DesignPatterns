package ducks.behaviours;

import ducks.interfaces.QuackBehaviour;

public class QuackSqueak implements QuackBehaviour {
    public String quack() {
        return "Squeak!";
    }
}
