package IO_Streams;

import java.io.*;
import java.util.*;

public class WordCount {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input file name");
        String inputFile = sc.nextLine();

        System.out.println("Enter output file name");
        String outputFile = sc.nextLine();


        BufferedReader br =
                new BufferedReader(new FileReader(inputFile));


        Map<String, Integer> wordMap = new TreeMap<>();

        String line;


        while ((line = br.readLine()) != null) {

            String words[] = line.split(" ");

            for (String word : words) {

                if (word.length() > 0) {

                    wordMap.put(word,
                            wordMap.getOrDefault(word, 0) + 1);
                }
            }
        }

        br.close();


        BufferedWriter bw =
                new BufferedWriter(new FileWriter(outputFile));


        for (Map.Entry<String, Integer> entry :
                wordMap.entrySet()) {

            bw.write(entry.getKey()
                    + " : "
                    + entry.getValue());

            bw.newLine();
        }


        bw.close();


        System.out.println("Word count completed.");

        sc.close();
    }
}