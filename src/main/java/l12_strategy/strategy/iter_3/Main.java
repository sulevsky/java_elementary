package l12_strategy.strategy.iter_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(10);
        list.add(110);
        list.add(4);

        Comparator comparator = new DescendingComparator();
        System.out.println(list);
        Collections.sort(list, Comparator.naturalOrder());
        System.out.println(list);

    }
}
