package IO_Streams;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name");
        String fileName = sc.nextLine();

        System.out.println("Enter the character to be counted");
        char ch = sc.next().charAt(0);

        FileReader fr = new FileReader(fileName);

        int count = 0;
        int data;

        while ((data = fr.read()) != -1) {

            char fileChar = (char) data;

            if (Character.toLowerCase(fileChar) ==
                    Character.toLowerCase(ch)) {
                count++;
            }
        }

        fr.close();

        System.out.println("File '" + fileName +
                "' has " + count +
                " instances of letter '" + ch + "'.");

        sc.close();
    }
}