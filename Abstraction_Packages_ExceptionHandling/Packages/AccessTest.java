package Abstraction_Packages_ExceptionHandling.Packages;

import Abstraction_Packages_ExceptionHandling.Packages.test_package.foundation;

public class AccessTest {

    public static void main(String[] args) {

        foundation obj = new foundation();

        // Private variable
        // System.out.println(obj.var1);

        // Default variable
        // System.out.println(obj.var2);

        // Protected variable
        // System.out.println(obj.var3);

        // Public variable
        System.out.println("Public variable: " + obj.var4);
    }
}