package Ducks.duck;

import Ducks.interfaces.FlyBehaviour;
import Ducks.interfaces.QuackBehaviour;

public abstract class Duck {

    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public Duck(){
    }

    public abstract String display();

    public String performQuack(){
        return quackBehaviour.quack();
    }

    public String performFly(){
        return flyBehaviour.fly();
    }

    public void swim(){
        System.out.println("All ducks can swim!");
    }

    public void setFlyBehaviour(FlyBehaviour fb){
        this.flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        this.quackBehaviour = qb;
    }



}
