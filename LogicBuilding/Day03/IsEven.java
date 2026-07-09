package LogicBuilding.Day03;

import java.util.Scanner;

public class IsEven {

    public static int isEven(int number) {

        if (number % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println(isEven(n));

        sc.close();
    }
}