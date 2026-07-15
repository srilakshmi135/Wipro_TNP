package Collections.LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseStrings {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("Wipro");
        al.add("Lambda");
        al.add("Collection");
        al.add("Coding");
        al.add("Practice");
        al.add("Student");
        al.add("Laptop");
        al.add("GitHub");

        Collections.reverse(al);

        System.out.println("Reverse Order:");

        al.forEach(str -> System.out.println(str));
    }
}