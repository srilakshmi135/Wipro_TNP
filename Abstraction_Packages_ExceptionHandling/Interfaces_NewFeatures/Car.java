package Abstraction_Packages_ExceptionHandling.Interfaces_NewFeatures;

public class Car implements Vehicle, FourWheeler {

    @Override
    public void message() {

        Vehicle.super.message();

        System.out.println("Inside Car");
    }
}