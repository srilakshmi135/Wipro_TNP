package LogicBuilding.Day9;

public class PalindromeNumber {

    static int isPalindrome(int n) {

        int original = Math.abs(n);
        int temp = original;
        int reverse = 0;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        if (original == reverse)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {

        int n = 121;

        if (isPalindrome(n) == 2)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}