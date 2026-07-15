package Collections.Map;
package Collections.Map;
import java.util.*;

public class StringHashMap {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("101", "Java");
        map.put("102", "Python");
        map.put("103", "SQL");

        System.out.println("Key 102 Exists : " + map.containsKey("102"));

        System.out.println("Value Java Exists : " + map.containsValue("Java"));

        System.out.println("\nUsing Iterator");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}