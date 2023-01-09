
//A1, B2, C4, D8, E16, F32
import java.util.Scanner;

class qstn12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int n = sc.nextInt();
        int x = 1;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            System.out.print(ch + "" + x + ", ");
            x = x * 2;
            ch++;
        }
    }
}
