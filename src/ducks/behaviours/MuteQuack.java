package ducks.behaviours;

import ducks.interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    public String quack() {
        return "(Silence)";
    }
}
