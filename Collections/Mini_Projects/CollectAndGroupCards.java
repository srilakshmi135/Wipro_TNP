package Collections.Mini_Projects;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Card {

    String symbol;
    int number;

    Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
}

public class CollectAndGroupCards {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<String, ArrayList<Card>> map = new TreeMap<>();

        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");

            String symbol = sc.next();
            int number = sc.nextInt();

            Card card = new Card(symbol, number);

            map.putIfAbsent(symbol, new ArrayList<>());
            map.get(symbol).add(card);
        }

        System.out.println("Distinct Symbols are :");

        for (String s : map.keySet()) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (Map.Entry<String, ArrayList<Card>> entry : map.entrySet()) {

            System.out.println("Cards in " + entry.getKey() + " Symbol");

            int sum = 0;

            for (Card c : entry.getValue()) {
                System.out.println(c.symbol + " " + c.number);
                sum += c.number;
            }

            System.out.println("Number of cards : " + entry.getValue().size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}