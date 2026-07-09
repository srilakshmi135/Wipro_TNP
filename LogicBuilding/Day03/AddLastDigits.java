package LogicBuilding.Day03;

import java.util.Scanner;

public class AddLastDigits {

    public static int addLastDigits(int input1, int input2) {

        input1 = Math.abs(input1);
        input2 = Math.abs(input2);

        int digit1 = input1 % 10;
        int digit2 = input2 % 10;

        return digit1 + digit2;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum of last digits: " + addLastDigits(a, b));

        sc.close();
    }
}