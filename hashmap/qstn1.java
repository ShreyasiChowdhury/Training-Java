
/*
Develop a java class with a instance variable CountryMap  HashMap (m1) add a method saveCountryCapital(String country_name, String capital), the method should add the passed country and capital as key/value in the map m1 and return the Map (m1).
Key- Country	Value - Capital
India			Delhi
Japan			Tokyo

Develop a method getCapital(String CountryName) which returns the capital for the country passed from the Map m1 created in step 1.

Develop a method getCountry(String capitalName) which returns the country for the capital name passed from the Map m1 created in step 1.

Develop a method which iterates through the map m1 and creates another map m2 with Capital as the key and value as Country and returns the Map m2.

Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.

*/
import java.util.*;

class CountryMap {
    HashMap<String, String> m1 = new HashMap<>();

    HashMap<String, String> saveCountryCapital(String country, String capital) {
        m1.put(country, capital);
        return m1;
    }

    String getCapital(String country) {
        return m1.get(country);
    }

    String getCountry(String capital) {
        String ans = "";
        for (String k : m1.keySet()) {
            if (m1.get(k).equals(capital))
                ans = k;
            break;
        }
        return ans;
    }

    HashMap<String, String> reverseMap() {
        HashMap<String, String> m2 = new HashMap<>();
        for (String x : m1.keySet()) {
            m2.put(m1.get(x), x);
        }
        return m2;
    }

    ArrayList<String> addMap() {
        ArrayList<String> al = new ArrayList<>();
        for (String x : m1.keySet()) {
            al.add(x);
        }
        return al;
    }
}

public class qstn1 {
    public static void main(String[] args) {
        CountryMap obj = new CountryMap();
        HashMap<String, String> hm;
        hm = obj.saveCountryCapital("India", "Delhi");
        hm = obj.saveCountryCapital("Japan", "Tokyo");
        System.out.println("The HashMap after insertion is: " + hm);
        System.out.println("Capital of India: " + obj.getCapital("India"));
        System.out.println("Tokyo is the capital of: " + obj.getCountry("Tokyo"));
        HashMap<String, String> rev_hm = obj.reverseMap();
        System.out.println("The new HashMap after invertion is: " + rev_hm);
        ArrayList<String> new_al = obj.addMap();
        System.out.println("The ArrayList after insertion is: " + new_al);
    }
}