
//14, 28, 20, 40, 32, 64
import java.util.Scanner;

class qstn11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range:");
		int n = sc.nextInt();
		int x = 6, y = 12;
		int a = 14, b = 28;
		int i, j = 1, k = 1;
		for (i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				x = x * j;
				System.out.print(a + ", ");
				a = a + x;
				j++;
			} else {
				y = y * k;
				System.out.print(b + ", ");
				b = b + y;
				k++;
			}
		}
	}
}
