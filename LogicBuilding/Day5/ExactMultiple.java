package LogicBuilding.Day5;

public class ExactMultiple {

    public static int isExactMultiple(int n, int m) {

        if (m == 0)
            return 1;

        if (n % m == 0)
            return 2;
        else
            return 1;
    } public static void main(String[] args) {

        int n = 20;
        int m = 5;

        System.out.println(isExactMultiple(n, m));
    }
}