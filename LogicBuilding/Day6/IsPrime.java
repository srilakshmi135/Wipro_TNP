package LogicBuilding.Day6;

public class IsPrime {

    public static int isPrime(int n) {

        if (n <= 1)
            return 1;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0)
                return 1;
        }

        return 2;
    }

    public static void main(String[] args) {

        int n = 17;

        if (isPrime(n) == 2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}