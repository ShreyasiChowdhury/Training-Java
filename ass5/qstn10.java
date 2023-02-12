import java.util.Scanner;

public class qstn10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number:");
        int n = sc.nextInt();
        int sum = 0, x = n - 1;
        for (int i = 1; i < n; i++) {
            sum = sum + i;
        }
        x = x + sum;
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num = x;
            for (int j = 1; j <= n; j++) {
                if ((j <= n - i + 1) && (i == 1 || i == n)) {
                    System.out.print(x + "\t");
                    x++;
                } else if ((j == 1 || j == n - i + 1) && (i > 1 && i < n)) {
                    System.out.print(x + "\t");
                    x++;
                } else if ((j > 1 && j < n - i + 1) && (i > 1 && i < n)) {
                    System.out.print("\t");
                    x++;
                }
            }
            System.out.println();
            x = num - n + i;
        }
    }
}
