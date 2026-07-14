package Collections.Set;

import java.util.HashSet;

public class HashSetCountry {

    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    public String getCountry(String CountryName) {

        for (String country : H1) {
            if (country.equals(CountryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        HashSetCountry obj = new HashSetCountry();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Germany");

        System.out.println(obj.H1);

        System.out.println("Search Country: " + obj.getCountry("India"));

        System.out.println("Search Country: " + obj.getCountry("China"));
    }
}