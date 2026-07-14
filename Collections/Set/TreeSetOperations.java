package Collections.Set;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperations {

    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();

        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("Germany");

        System.out.println("Original TreeSet:");
        System.out.println(countries);


        // a) Reverse elements

        System.out.println("\nReverse Order:");

        TreeSet<String> reverse = 
                new TreeSet<>(countries.descendingSet());

        System.out.println(reverse);



        // b) Iterator

        System.out.println("\nUsing Iterator:");

        Iterator<String> itr = countries.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }



        // c) Check element exists

        System.out.println("\nCheck India:");

        if(countries.contains("India"))
            System.out.println("India Exists");
        else
            System.out.println("Not Found");
    }
}