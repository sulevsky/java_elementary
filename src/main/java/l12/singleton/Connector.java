package l12.singleton;

public class Connector {

    public static final int DEFAULT_CONNECTION_NUMBER = 10;

    private static Connector connector;

    public static Connector getInstance() {
        if(connector == null){
           /////// //
            connector = new Connector();
        }
        return connector;
    }

    {
        System.out.println(DEFAULT_CONNECTION_NUMBER
                           + " connections created");
    }

    private Connector() {

    }

    public void connect() {
        System.out.println("Connected");
    }
}
