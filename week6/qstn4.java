import java.util.*;

public class qstn4 {
    static void rev(String str) {
        if ((str == null) || (str.length() <= 1))
            System.out.println(str);
        else {
            System.out.print(str.charAt(str.length() - 1));
            rev(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        rev(str);
        sc.close();
    }
}