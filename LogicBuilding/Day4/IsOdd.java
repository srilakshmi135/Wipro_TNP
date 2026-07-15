package LogicBuilding.Day4;

public class IsOdd {

    public static int isOdd(int n) {

        if (n % 2 != 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {

        int n = 15;

        System.out.println(isOdd(n));
    }
}