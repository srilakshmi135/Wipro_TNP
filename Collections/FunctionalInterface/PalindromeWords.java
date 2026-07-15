package Collections.FunctionalInterface;

import java.util.*;
import java.util.function.Predicate;

public class PalindromeWords {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "madam","java","level","hello","racecar",
                "abc","noon","radar","world","civic"));

        Predicate<String> palindrome =
                s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());

        System.out.println("Palindrome Words:");

        words.stream()
                .filter(palindrome)
                .forEach(System.out::println);
    }
}