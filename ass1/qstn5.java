
// sum of squares
import java.util.Scanner;

class qstn5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + ", ");
        }
    }
}