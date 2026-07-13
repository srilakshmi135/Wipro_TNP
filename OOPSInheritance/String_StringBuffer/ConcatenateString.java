package OOPSInheritance.String_StringBuffer;

import java.util.Scanner;

public class ConcatenateString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String result = a.toLowerCase() + b.toLowerCase();

        if(result.charAt(0) == result.charAt(1))
            result = result.substring(1);

        System.out.println(result);

        sc.close();
    }
}