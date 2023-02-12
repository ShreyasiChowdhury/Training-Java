import java.util.Scanner;

public class qstn14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number:");
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j == 1 || j == i) && (i <= n)) {
                    System.out.print("*\t");
                } else if ((j == 1 || j == 2 * n - i) && (i > n)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}