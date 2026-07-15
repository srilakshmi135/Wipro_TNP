package Collections.MethodReference;

public class DigitCount {

    public static int digitCount(int n) {

        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        DigitCountInterface dc = DigitCount::digitCount;

        System.out.println("Number of Digits = " + dc.count(123456));
    }
}