package l8_interface;

public class Parrot implements Greetable {
    public Parrot() {
    }

    @Override
    public void greet() {
        System.out.println("Carrrr");
    }
}
