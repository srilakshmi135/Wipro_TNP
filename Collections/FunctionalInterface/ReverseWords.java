package Collections.FunctionalInterface;

import java.util.*;
import java.util.function.Consumer;

public class ReverseWords {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "Java", "Python", "HTML", "CSS", "SQL",
                "React", "Spring", "Oracle", "Git", "Linux"));

        Consumer<ArrayList<String>> reverse = list -> {
            for (int i = 0; i < list.size(); i++) {
                String s = list.get(i);
                list.set(i, new StringBuilder(s).reverse().toString());
            }
        };

        reverse.accept(words);

        System.out.println("Reversed Words:");
        words.forEach(System.out::println);
    }
}