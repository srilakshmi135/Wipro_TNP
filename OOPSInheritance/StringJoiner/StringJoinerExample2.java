package OOPSInheritance.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample2 {

    public static void main(String[] args) {

        StringJoiner s1 = new StringJoiner("-");

        s1.add("Hyderabad");
        s1.add("Vijayawada");
        s1.add("Chennai");


        StringJoiner s2 = new StringJoiner("-");

        s2.add("Delhi");
        s2.add("Mumbai");
        s2.add("Pune");


        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);


        s1.merge(s2);

        System.out.println("After merge: " + s1);
    }
}