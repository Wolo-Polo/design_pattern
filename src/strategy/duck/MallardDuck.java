package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

public class MallardDuck extends Duck {

    public MallardDuck(float weight, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(weight, flyBehavior, quackBehavior);
    }
}
