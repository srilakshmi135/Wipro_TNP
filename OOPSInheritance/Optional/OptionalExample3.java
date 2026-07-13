package OOPSInheritance.Optional;

import java.util.Optional;

class InvalidEmployeeException extends Exception {

    public InvalidEmployeeException(String message) {
        super(message);
    }
}

public class OptionalExample3 {

    public static void main(String[] args) {

        String employee = null;

        try {

            Optional<String> emp = Optional.ofNullable(employee);

            String name = emp.orElseThrow(
                    () -> new InvalidEmployeeException("Employee not found")
            );

            System.out.println(name);

        } 
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}