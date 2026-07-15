package Collections.Map;
import java.util.*;

public class StateCapital {

    public static void main(String[] args) {

        Properties states = new Properties();

        states.put("Andhra Pradesh", "Amaravati");
        states.put("Telangana", "Hyderabad");
        states.put("Tamil Nadu", "Chennai");
        states.put("Karnataka", "Bengaluru");

        Iterator<Object> it = states.keySet().iterator();

        while (it.hasNext()) {

            String state = (String) it.next();

            System.out.println(state + " -> " + states.getProperty(state));
        }
    }
}