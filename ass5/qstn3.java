import java.util.Scanner;

public class qstn3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((j <= i) && (i == 1 || i == n)) {
					System.out.print(i + "\t");
				} else if (j == 1 || j == i) {
					System.out.print(i + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
