package flowcontrol;

public class PrimeOrNot {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            return;
        }

        int num = Integer.parseInt(args[0]);

        if (num == 0 || num == 1) {
            System.out.println(num + " is neither prime nor composite");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}