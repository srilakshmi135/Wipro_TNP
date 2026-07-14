package Collections.Set;


import java.util.TreeSet;

public class TreeSetCountry {

    TreeSet<String> T1 = new TreeSet<>();


    public TreeSet<String> saveCountryNames(String CountryName) {

        T1.add(CountryName);

        return T1;
    }


    public String getCountry(String CountryName) {


        for(String country : T1) {

            if(country.equals(CountryName)) {
                return country;
            }
        }

        return null;
    }



    public static void main(String[] args) {


        TreeSetCountry obj = new TreeSetCountry();


        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");


        System.out.println(obj.T1);


        System.out.println("Search Country: "
                + obj.getCountry("Japan"));


        System.out.println("Search Country: "
                + obj.getCountry("China"));

    }
}