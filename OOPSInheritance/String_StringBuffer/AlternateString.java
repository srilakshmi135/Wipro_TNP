package OOPSInheritance.String_StringBuffer;

import java.util.Scanner;

public class AlternateString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        String b=sc.next();

        StringBuffer result=new StringBuffer();

        int max=Math.max(a.length(),b.length());

        for(int i=0;i<max;i++){

            if(i<a.length())
                result.append(a.charAt(i));

            if(i<b.length())
                result.append(b.charAt(i));
        }

        System.out.println(result);

        sc.close();
    }
}