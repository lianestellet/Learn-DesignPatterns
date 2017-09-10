package Ducks.behaviours;

import Ducks.interfaces.QuackBehaviour;

public class QuackSqueak implements QuackBehaviour {
    public String quack() {
        return "Squeak!";
    }
}
