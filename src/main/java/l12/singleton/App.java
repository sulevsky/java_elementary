package l12.singleton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List collection1 = new LinkedList();
        for (Object o : collection1){
//
        }
        collection1.add("hello");
        collection1.add("hello1");
        System.out.println(collection1.get(1));

        Collection collection2 = new LinkedList();
        collection2.add("world");

        ArrayList collection3 = new ArrayList();
        collection3.addAll(collection1);
        collection3.addAll(collection2);
        System.out.println(collection3);


    }
}
