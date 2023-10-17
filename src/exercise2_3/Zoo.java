package exercise2_3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();

        String wolf = "wolf";
        String leon = "leon";
        String tiger = "tiger";
        String elefant = "elefant";
        String monkey = "monkey";
        String hawk = "hawk";
        String horse = "horse";
        String leopard = "leopard";

        zoo.add(0, wolf);
        zoo.add(1, leon);
        zoo.add(2, tiger);
        zoo.add(3, elefant);
        zoo.add(4, monkey);
        zoo.add(5, hawk);
        zoo.add(6, horse);
        zoo.add(7, leopard);

        System.out.println(List.of(zoo));

        zoo.remove(3);
        zoo.remove(4);
        zoo.remove(5);

        System.out.println(zoo.size());

        System.out.println(List.of(zoo));
    }
}
