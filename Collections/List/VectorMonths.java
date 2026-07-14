package Collections.List;

import java.util.Vector;


public class VectorMonths {


    public static void main(String[] args) {


        Vector<String> months = new Vector<>();


        months.add("January");
        months.add("February");
        months.add("March");


        for(String m : months) {

            System.out.println(m);
        }
    }
}