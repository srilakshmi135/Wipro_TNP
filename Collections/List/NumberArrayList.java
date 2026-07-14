package Collections.List;


import java.util.ArrayList;


public class NumberArrayList {


    public static void main(String[] args) {


        ArrayList<Number> numbers = new ArrayList<>();


        numbers.add(10);
        numbers.add(20.5f);
        numbers.add(30.55);


        for(Number n : numbers) {

            System.out.println(n);
        }
    }
}