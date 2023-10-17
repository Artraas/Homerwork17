package exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        ListIterator<Integer> listIterator = values.listIterator();

        int i = 0;

        while (listIterator.hasNext()){
            values.set(i++, listIterator.next() + 1);
        }
        
        System.out.println(values);
    }
}
