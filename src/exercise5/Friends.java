package exercise5;

import java.util.ArrayList;
import java.util.Arrays;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();

        friends.add("Alex");
        friends.add("Ronald");
        friends.add("John");
        friends.add("Nick");
        friends.add("Ben");

        System.out.println(friends);

        String[] friends2 = new String[5];

        friends.toArray(friends2);

        Arrays.sort(friends2);

        System.out.println((Arrays.toString(friends2)));
    }
}
