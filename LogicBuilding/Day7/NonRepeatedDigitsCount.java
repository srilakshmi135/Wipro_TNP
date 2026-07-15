package LogicBuilding.Day7;

public class NonRepeatedDigitsCount {

    static int nonRepeatedDigits(int n) {

        n = Math.abs(n);

        int[] freq = new int[10];

        if (n == 0)
            freq[0]++;

        while (n > 0) {

            freq[n % 10]++;
            n /= 10;
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {

            if (freq[i] == 1)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(nonRepeatedDigits(122334455));
    }
}