package Abstraction_Packages_ExceptionHandling.ExceptionHandling;


class InvalidAgeException extends Exception {


    public InvalidAgeException(String msg) {

        super(msg);

    }

}


public class AgeValidation {


    public static void main(String[] args) {


        try {


            String name = args[0];

            int age = Integer.parseInt(args[1]);


            if(age < 18 || age >= 60) {

                throw new InvalidAgeException(
                "Age should be between 18 and 59");

            }


            System.out.println("Name: "+name);
            System.out.println("Age is valid");


        }
        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Please enter name and age");

        }
        catch(NumberFormatException e) {

            System.out.println("Age should be a number");

        }
        catch(InvalidAgeException e) {

            System.out.println(e.getMessage());

        }

    }
}