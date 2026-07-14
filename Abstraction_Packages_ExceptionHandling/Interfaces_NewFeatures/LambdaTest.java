package Abstraction_Packages_ExceptionHandling.Interfaces_NewFeatures;

public class LambdaTest {

    public static void main(String[] args) {


        Test t1 = (a,b,c) -> a+b+c;

        Test t2 = (a,b,c) -> a*b*c;


        System.out.println("Addition: " + t1.myFunction(2,3,4));

        System.out.println("Multiplication: " + t2.myFunction(2,3,4));

    }
}