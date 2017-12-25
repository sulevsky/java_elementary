package l8_interface;

public class Greeter {
    public static final String test = "Hello";

    public static void main(String[] args) {
        Parrot fomka = new Parrot();
        Person ivanov = new Person("Ivan", "Ivanov");
//        System.out.println(ivanov.test);

    }

    public static void makeHimGreet(final Greetable greetable) {
        greetable.greet();
    }
}
