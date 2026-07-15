package Collections.FunctionalInterface;

import java.util.*;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(2, 5, 8, 11, 14, 17, 20, 23, 26, 29));

        Consumer<Integer> display = n -> {
            if (n % 2 == 0)
                System.out.println(n + " Even");
            else
                System.out.println(n + " Odd");
        };

        numbers.forEach(display);
    }
}