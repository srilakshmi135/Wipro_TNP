package Abstraction_Packages_ExceptionHandling.ExceptionHandling;

import java.util.Scanner;


class InvalidMarksException extends Exception {

    public InvalidMarksException(String msg) {
        super(msg);
    }
}


public class AverageMarks {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        try {


            System.out.println("Enter student name");
            String name = sc.next();


            int total = 0;


            for(int i=1;i<=3;i++) {

                System.out.println("Enter marks of subject "+i);

                int mark = sc.nextInt();


                if(mark < 0 || mark > 100)
                    throw new InvalidMarksException("Marks should be between 0 and 100");


                total += mark;

            }


            System.out.println(name+" Average = "+total/3.0);


        }
        catch(InvalidMarksException e) {

            System.out.println(e.getMessage());

        }


        sc.close();

    }
}