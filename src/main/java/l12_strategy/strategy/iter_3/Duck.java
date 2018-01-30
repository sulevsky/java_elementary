package l12_strategy.strategy.iter_3;

public class Duck {

    private Displayable displayable;

    public void setDisplayable(Displayable displayable) {
        this.displayable = displayable;
    }

    public void display(){

        System.out.println(displayable.getDisplayMessage());
    }


    public void quack(){
        System.out.println("Quack");
    }
    public void swim(){
        System.out.println("Swim");
    }
    public void fly(){
        System.out.println("Fly");
    }

}
