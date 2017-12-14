package inheritance;

import java.util.Arrays;

public class Array {
    private int[] inner;
    public void add(int el) {
        if(inner == null){
            inner = new int[1];
            inner[0] = el;
        }else{}

    }
    public int get(int index) {
        return 0;
    }

    @Override
    public String toString() {
        return "Array{" +
               "inner=" + Arrays.toString(inner) +
               '}';
    }
}
