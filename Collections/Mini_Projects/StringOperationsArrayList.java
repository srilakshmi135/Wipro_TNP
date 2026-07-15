package Collections.Mini_Projects;

import java.util.ArrayList;
import java.util.Scanner;

public class StringOperationsArrayList {

    public static ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> result = new ArrayList<>();

        // 1. Replace alternate characters of S1 with S2
        StringBuilder op1 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                op1.append(s2);
            else
                op1.append(s1.charAt(i));
        }
        result.add(op1.toString());

        // 2. Replace last occurrence of S2 with reverse(S2)
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != -1 && first != last) {
            String reverse = new StringBuilder(s2).reverse().toString();
            String op2 = s1.substring(0, last)
                    + reverse
                    + s1.substring(last + s2.length());
            result.add(op2);
        } else {
            result.add(s1 + s2);
        }

        // 3. Delete first occurrence of S2
        if (first != -1 && first != last) {
            String op3 = s1.replaceFirst(s2, "");
            result.add(op3);
        } else {
            result.add(s1);
        }

        // 4. Divide S2 into two halves and attach
        int mid = (s2.length() + 1) / 2;

        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);

        result.add(firstHalf + s1 + secondHalf);

        // 5. Replace common characters with *
        StringBuilder op5 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            if (s2.indexOf(ch) != -1)
                op5.append('*');
            else
                op5.append(ch);
        }

        result.add(op5.toString());

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String S1:");
        String s1 = sc.nextLine();

        System.out.println("Enter String S2:");
        String s2 = sc.nextLine();

        ArrayList<String> output = performOperations(s1, s2);

        System.out.println("\nOutput:");

        for (int i = 0; i < output.size(); i++) {
            System.out.println((i + 1) + ". " + output.get(i));
        }

        sc.close();
    }
}