package Abstraction_Packages_ExceptionHandling.ExceptionHandling;

public class MathOperation {


    public static void main(String[] args) throws ArithmeticException {


        try {

            int sum = 0;

            int[] arr = new int[5];


            for(int i=0;i<5;i++) {

                arr[i] = Integer.parseInt(args[i]);

                sum += arr[i];
            }


            double average = sum / 5.0;


            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);


        }
        catch(NumberFormatException e) {

            System.out.println("NumberFormatException");

        }
        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Please enter 5 integers");

        }

    }
}