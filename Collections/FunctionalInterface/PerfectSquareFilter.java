package Collections.FunctionalInterface;

import java.util.*;
import java.util.function.Predicate;

public class PerfectSquareFilter {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(0, 1, 2, 4, 7, 9, 15, 16, 25, 30));

        Predicate<Integer> perfectSquare = n -> {
            int root = (int) Math.sqrt(n);
            return root * root == n;
        };

        System.out.println("Perfect Square Numbers:");

        numbers.stream()
                .filter(perfectSquare)
                .forEach(System.out::println);
    }
}