import java.util.*;

public class qstn5 {
    static void remove(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' &&
                    str.charAt(i) < 'A'
                    || str.charAt(i) > 'Z' &&
                            str.charAt(i) < 'a'
                    || str.charAt(i) > 'z') {
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        System.out.print(str.toUpperCase());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        remove(str);
        sc.close();
    }
}