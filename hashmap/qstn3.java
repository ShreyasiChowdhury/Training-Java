import java.util.*;

public class qstn3 {
    ArrayList<String> al1 = new ArrayList<>();
    ArrayList<String> al2 = new ArrayList<>();

    void addElement(String state, String capital) {
        al1.add(state);
        al2.add(capital);
    }

    void viewElement() {
        for (Iterator<String> itr1 = al1.iterator(); itr1.hasNext();) {
            for (Iterator<String> itr2 = al2.iterator(); itr2.hasNext();) {
                System.out.print(itr1.next() + " --> ");
                System.out.println(itr2.next());
            }
        }
    }

    public static void main(String[] args) {
        qstn3 obj = new qstn3();
        obj.addElement("West Bengal", "Kolkata");
        obj.addElement("Bihar", "Patna");
        obj.addElement("Maharashtra", "Mumbai");
        obj.addElement("Uttar Pradesh", "Lucknow");
        obj.addElement("Tamilnadu", "Chennai");
        obj.addElement("Telengana", "Hyderabad");
        obj.addElement("Karnataka", "Bangalore");
        obj.viewElement();
    }
}