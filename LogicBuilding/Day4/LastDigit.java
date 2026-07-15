package LogicBuilding.Day4;

public class LastDigit {

    public static int getLastDigit(int n) {

        if (n < 0)
            n = -n;

        return n % 10;
    }

    public static void main(String[] args) {

        int n = -197;

        System.out.println(getLastDigit(n));
    }
}