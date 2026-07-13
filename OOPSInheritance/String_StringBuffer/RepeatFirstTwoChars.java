package OOPSInheritance.String_StringBuffer;

import java.util.Scanner;

public class RepeatFirstTwoChars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String firstTwo = str.substring(0,2);

        StringBuffer sb = new StringBuffer();

        for(int i=0;i<str.length();i++)
            sb.append(firstTwo);

        System.out.println(sb);

        sc.close();
    }
}