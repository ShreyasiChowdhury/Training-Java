
/*
Create a Collection called HashMap which is capable of string String objects.
The program should have the following abilities:
a) Check if a particular key exists or not
b) Check if a particular value exists or not
c) Use Iterator to loop through the map key set
*/
import java.util.*;

class Test {
    HashMap<String, String> hm = new HashMap<>();

    void addElement(String key, String value) {
        hm.put(key, value);
    }

    void checkKey(String key1) {
        if (hm.containsKey(key1))
            System.out.println(key1 + " is present");
        else
            System.out.println(key1 + " is not present");
    }

    void checkValue(String value1) {
        if (hm.containsValue(value1))
            System.out.println(value1 + " is present");
        else
            System.out.println(value1 + " is not present");
    }
}

public class qstn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test obj = new Test();
        obj.addElement("Shreyasi", "132");
        obj.addElement("Nilayan", "134");
        obj.addElement("Monidipa", "138");
        obj.addElement("Jishan", "146");
        obj.addElement("Debajyoti", "150");
        System.out.println("Enter key to be searched:");
        String key1 = sc.next();
        System.out.println("Enter value to be searched:");
        String value1 = sc.next();
        obj.checkKey(key1);
        obj.checkValue(value1);
    }
}