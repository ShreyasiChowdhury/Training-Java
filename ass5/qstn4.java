import java.util.Scanner;

public class qstn4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((j >= n - i + 1 && j <= n) && (i == 1 || i == n)) {
					System.out.print(i + "\t");
				} else if (j == n - i + 1 || j == n) {
					System.out.print(i + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
