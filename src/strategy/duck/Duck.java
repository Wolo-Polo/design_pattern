package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

public abstract class Duck {
    private float weight;
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(float weight, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.weight = weight;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    //setter getter;
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
