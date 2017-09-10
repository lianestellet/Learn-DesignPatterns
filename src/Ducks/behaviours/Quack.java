package Ducks.behaviours;

import Ducks.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    public String quack() {
        return "Quack!";
    }
}
