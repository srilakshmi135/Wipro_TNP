package LogicBuilding.Day8;

public class DigitSumOption {

    static int digitSum(int n, boolean even) {

        n = Math.abs(n);

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            if (even) {

                if (digit % 2 == 0)
                    sum += digit;

            } else {

                if (digit % 2 != 0)
                    sum += digit;
            }

            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int number = 123456;

        System.out.println("Even Digit Sum = " + digitSum(number, true));
        System.out.println("Odd Digit Sum = " + digitSum(number, false));
    }
}