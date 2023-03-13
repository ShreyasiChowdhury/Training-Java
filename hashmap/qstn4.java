import java.util.*;

public class qstn4 {
    HashMap<String, Integer> hm = new HashMap<>();

    void addElement(String key, Integer value) {
        hm.put(key, value);
    }

    void checkKey(String key1) {
        if (hm.containsKey(key1))
            System.out.println(key1 + " is present");
        else
            System.out.println(key1 + " is not present");
    }

    void checkValue(Integer value1) {
        if (hm.containsValue(value1))
            System.out.println(value1 + " is present");
        else
            System.out.println(value1 + " is not present");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        qstn4 obj = new qstn4();
        obj.addElement("Shreyasi", 11111);
        obj.addElement("Nilayan", 22222);
        obj.addElement("Monidipa", 33333);
        obj.addElement("Jishan", 44444);
        obj.addElement("Debajyoti", 55555);
        System.out.println("Enter Name to be searched:");
        String key1 = sc.next();
        System.out.println("Enter Number to be searched:");
        Integer value1 = sc.nextInt();
        obj.checkKey(key1);
        obj.checkValue(value1);
    }
}