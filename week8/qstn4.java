import java.util.Scanner;

public class qstn4 {
    static final int NO_OF_CHARS = 256;

    static char getSec(String str) {
        int[] count = new int[NO_OF_CHARS];
        int i;
        for (i = 0; i < str.length(); i++)
            (count[str.charAt(i)])++;
        int first = 0, second = 0;
        for (i = 0; i < NO_OF_CHARS; i++) {
            if (count[i] > count[first]) {
                second = first;
                first = i;
            } else if (count[i] > count[second] && count[i] != count[first])
                second = i;
        }
        return (char) second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = getSec(str);
        if (c != '\0')
            System.out.println(c);
        sc.close();
    }
}