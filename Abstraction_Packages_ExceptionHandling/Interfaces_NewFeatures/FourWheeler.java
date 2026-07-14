package Abstraction_Packages_ExceptionHandling.Interfaces_NewFeatures;

public interface FourWheeler {

    default void message() {
        System.out.println("Inside FourWheeler");
    }
}