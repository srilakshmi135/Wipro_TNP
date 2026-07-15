package LogicBuilding.Day7;

public class NumberOfPrimes {

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    static int countPrimes(int start, int end) {

        int count = 0;

        for (int i = start; i <= end; i++) {

            if (isPrime(i))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countPrimes(1, 20));
    }
}