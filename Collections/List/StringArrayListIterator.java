package Collections.List;


import java.util.ArrayList;
import java.util.Iterator;


public class StringArrayListIterator {


    static void printAll(ArrayList<String> list) {


        Iterator<String> itr = list.iterator();


        while(itr.hasNext()) {

            System.out.println(itr.next());
        }
    }



    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.add("Java");
        names.add("Python");
        names.add("SQL");


        printAll(names);
    }
}