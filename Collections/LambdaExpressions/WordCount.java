package Collections.LambdaExpressions;

public class WordCount {

    public static void main(String[] args) {

        WordCountInterface wc = (str) -> {
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }
            return str.trim().split("\\s+").length;
        };

        String text = "Welcome to Wipro TalentNext Java Full Stack";

        System.out.println("String : " + text);
        System.out.println("Word Count : " + wc.count(text));
    }
}