
//A1, B2, C3, …., Y25,Z26, A1, B2
import java.util.Scanner;

class qstn13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int n = sc.nextInt();
        char ch = 'A';
        int x = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(ch);
            System.out.print(x + ", ");
            ch++;
            x++;
            if (i % 26 == 0) {
                ch = 'A';
                x = 1;
            }
        }
    }
}
