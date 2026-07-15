package LogicBuilding.Day6;

public class NthPrime {

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static int nthPrime(int n) {

        int count = 0;
        int number = 1;

        while (count < n) {

            number++;

            if (isPrime(number))
                count++;
        }

        return number;
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.println(nthPrime(n));
    }
}