package Ducks.behaviours;

import Ducks.interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    public String quack() {
        return "(Silence)";
    }
}
