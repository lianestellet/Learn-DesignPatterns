package ducks.behaviours;

import ducks.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    public String quack() {
        return "Quack!";
    }
}
