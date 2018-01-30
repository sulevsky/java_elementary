package l12_strategy.strategy.iter_4;

import l12_strategy.strategy.iter_4.fly.FlyWithWings;
import l12_strategy.strategy.iter_4.quack.Quack;

/**
 * Created by VSulevskiy on 07.05.2015.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a redhead duck");
    }
}
