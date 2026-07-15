package LogicBuilding.Day7;

public class AllDigitsCount {

    static int countDigits(int n) {

        n = Math.abs(n);

        if (n == 0)
            return 1;

        int count = 0;

        while (n > 0) {

            count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countDigits(123456));
    }
}