package Collections.Set;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetEmployee {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Ravi");
        employees.add("Sita");
        employees.add("Kiran");
        employees.add("Anu");

        Iterator<String> itr = employees.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}