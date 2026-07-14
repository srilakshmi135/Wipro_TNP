package Abstraction_Packages_ExceptionHandling.ExceptionHandling;


class InvalidCountryException extends Exception {


    public InvalidCountryException(String msg) {

        super(msg);

    }

}


public class UserRegistration {


    public static void registerUser(String username,String userCountry)
            throws InvalidCountryException {


        if(!userCountry.equals("India")) {

            throw new InvalidCountryException(
            "User Outside India cannot be registered");

        }
        else {

            System.out.println("User registration done successfully");

        }

    }



    public static void main(String[] args) {


        try {

            registerUser("Mini","India");

        }
        catch(InvalidCountryException e) {

            System.out.println(e.getMessage());

        }

    }
}