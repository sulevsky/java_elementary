package l12.strategy_2.iter_4;

import l12.strategy_2.iter_4.fly.FlyWithWings;
import l12.strategy_2.iter_4.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
