package exercise6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teachers = new ArrayList<>();

        teachers.add("Rick");
        teachers.add("Jane");
        teachers.add("Kate");
        teachers.add("Diana");

        System.out.println("Best teacher - " + teachers.indexOf("Diana"));
        System.out.println("Good teacher - " + teachers.indexOf("Jane"));
        System.out.println("Normal teacher - " + teachers.indexOf("Kate"));
        System.out.println("Bad teacher - " + teachers.indexOf("Rick"));

        System.out.println(teachers);
    }
}
