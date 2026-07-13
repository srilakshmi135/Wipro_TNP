package OOPSInheritance.StringJoiner;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerExample1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ram");
        names.add("Sam");
        names.add("John");

        StringJoiner sj = new StringJoiner(", ", "{", "}");

        for(String name : names) {
            sj.add(name);
        }

        System.out.println(sj);
    }
}