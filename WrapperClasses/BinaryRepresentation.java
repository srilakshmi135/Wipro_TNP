package WrapperClasses;

import java.util.Scanner;

public class BinaryRepresentation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        String binary = Integer.toBinaryString(number);

        String result = String.format("%8s", binary)
                .replace(' ', '0');

        System.out.println(result);

        sc.close();
    }
}