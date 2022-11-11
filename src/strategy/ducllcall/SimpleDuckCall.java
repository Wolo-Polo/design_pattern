package strategy.ducllcall;

import strategy.quack.QuackBehavior;

public class SimpleDuckCall {
    private QuackBehavior quackBehavior;

    public void quack() {
        quackBehavior.quack();
    }

    public SimpleDuckCall(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
