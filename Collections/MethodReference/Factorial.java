package Collections.MethodReference;

public class Factorial {

    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Factorial obj = new Factorial();

        FactorialInterface fi = obj::factorial;

        System.out.println("Factorial of 5 = " + fi.factorial(5));
    }
}