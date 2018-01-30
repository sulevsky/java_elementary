package l12_strategy.strategy.iter_4.quack;

/**
 * Created by VSulevskiy on 07.05.2015.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}