package strategy;

import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.RubberDuck;
import strategy.ducllcall.SimpleDuckCall;
import strategy.fly.FlyNoWay;
import strategy.fly.FlyWithWings;
import strategy.quack.MuteQuack;
import strategy.quack.Quack;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(3, new FlyWithWings(), new Quack());
        Duck rubberDuck = new RubberDuck(0.2f, new FlyNoWay(), new MuteQuack());

        mallardDuck.fly();
        mallardDuck.quack();

        rubberDuck.fly();
        rubberDuck.quack();

        SimpleDuckCall simpleDuckCall = new SimpleDuckCall(new Quack());
        simpleDuckCall.quack();
    }
}
