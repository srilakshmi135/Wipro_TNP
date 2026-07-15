package Collections.Mini_Projects;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Card {

    String symbol;
    int number;

    Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
}

public class UniqueSymbolsCards {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Card> map = new LinkedHashMap<>();

        int count = 0;

        while (map.size() < 4) {

            System.out.println("Enter a card :");

            String symbol = sc.next();
            int number = sc.nextInt();

            count++;

            if (!map.containsKey(symbol)) {
                map.put(symbol, new Card(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");

        System.out.println("Cards in Set are :");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry ->
                        System.out.println(entry.getValue().symbol + " " + entry.getValue().number));

        sc.close();
    }
}