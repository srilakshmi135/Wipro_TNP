package LogicBuilding.Day4;

public class SecondLastDigit {

    public static int getSecondLastDigit(int n) {

        if (n < 0)
            n = -n;

        if (n < 10)
            return -1;

        return (n / 10) % 10;
    }

    public static void main(String[] args) {

        int n = 197;

        System.out.println(getSecondLastDigit(n));
    }
}