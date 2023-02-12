import java.util.Scanner;

public class qstn19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number:");
        int n = sc.nextInt();
        int count = 3;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if ((j == n - i + 1 || j == n + i - 1) && (i <= n)) {
                    System.out.print("*\t");
                } else if ((j == i - n + 1 || j == i + n - count) && (i > n)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            if (i > n) {
                count = count + 2;
            }
        }
    }
}