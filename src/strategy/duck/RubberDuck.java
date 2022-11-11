package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

public class RubberDuck extends Duck {
    public RubberDuck(float weight, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(weight, flyBehavior, quackBehavior);
    }
}
