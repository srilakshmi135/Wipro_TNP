package Collections.Map;
import java.util.*;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Sri", 987654321);
        contacts.put("Ram", 912345678);
        contacts.put("Anu", 998877665);

        System.out.println("Key Sri Exists : " + contacts.containsKey("Sri"));

        System.out.println("Value 912345678 Exists : "
                + contacts.containsValue(912345678));

        System.out.println("\nContact List");

        Iterator<Map.Entry<String, Integer>> it =
                contacts.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, Integer> entry = it.next();

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}