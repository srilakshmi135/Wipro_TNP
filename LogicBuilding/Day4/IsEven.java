package LogicBuilding.Day4;

public class IsEven {

    public static int isEven(int n) {

        if (n % 2 == 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {

        int n = 24;

        System.out.println(isEven(n));
    }
}