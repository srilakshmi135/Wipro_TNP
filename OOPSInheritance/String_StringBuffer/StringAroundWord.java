package OOPSInheritance.String_StringBuffer;

import java.util.Scanner;

public class StringAroundWord {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        String b=sc.next();

        StringBuffer result=new StringBuffer();

        int index=a.indexOf(b);

        while(index!=-1){

            if(index>0)
                result.append(a.charAt(index-1));

            if(index+b.length()<a.length())
                result.append(a.charAt(index+b.length()));

            index=a.indexOf(b,index+1);
        }

        System.out.println(result);

        sc.close();
    }
}