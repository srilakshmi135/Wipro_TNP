package Collections.LambdaExpressions;

import java.util.ArrayList;

public class OddLengthStrings {

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

        System.out.println("Strings with Odd Length:");

        al.forEach(str -> {
            if (str.length() % 2 != 0)
                System.out.println(str);
        });
    }
}