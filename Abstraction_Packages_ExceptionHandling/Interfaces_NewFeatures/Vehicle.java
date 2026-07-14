package Abstraction_Packages_ExceptionHandling.Interfaces_NewFeatures;

public interface Vehicle {

    default void message() {
        System.out.println("Inside Vehicle");
    }
}