import java.util.Scanner;

public class qstn16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number:");
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= n - i + 1 && j <= n && i <= n) {
                    System.out.print("*\t");
                } else if (j >= i - n + 1 && j <= n && i > n) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
