package Collections.MethodReference;

public class PrimeCheck {

    public PrimeCheck(int n) {

        boolean prime = true;

        if (n < 2) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }

    public static void main(String[] args) {

        PrimeInterface pi = PrimeCheck::new;

        pi.create(17);
        pi.create(20);
    }
}