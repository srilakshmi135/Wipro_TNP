package Collections.List;



import java.util.LinkedList;


public class LinkedListMonths {


    public static void main(String[] args) {


        LinkedList<String> months = new LinkedList<>();


        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");


        for(String m : months) {

            System.out.println(m);
        }
    }
}