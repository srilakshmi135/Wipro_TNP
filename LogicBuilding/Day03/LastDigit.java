package LogicBuilding.Day03;

import java.util.Scanner;

public class LastDigit {

    public static int getLastDigit(int number) {

        number = Math.abs(number);

        return number % 10;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Last digit: " + getLastDigit(n));

        sc.close();
    }
}