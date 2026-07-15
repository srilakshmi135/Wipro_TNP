package LogicBuilding.Day9;

public class PalindromePossible {

    static int isPalindromePossible(int n) {

        int[] freq = new int[10];

        n = Math.abs(n);

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int odd = 0;

        for (int i = 0; i < 10; i++) {

            if (freq[i] % 2 != 0)
                odd++;
        }

        if (odd <= 1)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {

        int n = 1221;

        if (isPalindromePossible(n) == 2)
            System.out.println("Palindrome Possible");
        else
            System.out.println("Palindrome Not Possible");
    }
}