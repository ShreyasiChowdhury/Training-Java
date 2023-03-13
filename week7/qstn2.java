import java.util.Scanner;

public class qstn2 {
	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	public static int ncr(int n, int r) {
		int temp1 = factorial(n);
		int temp2 = factorial(r);
		int temp3 = factorial(n - r);
		int res = temp1 / (temp2 * temp3);
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter line number: ");
		int line = sc.nextInt();
		int x = 0, k = 0, r = 0;
		for (int i = 1; i <= line; i++) {
			k = 1;
			r = 0;
			for (int j = 1; j <= 2 * line - 1; j++) {
				if (k == 1 && j >= line - i + 1 && j <= line + i - 1) {
					x = ncr(i - 1, r);
					System.out.print(x + "\t");
					k = 0;
					r++;
				} else {
					System.out.print("\t");
					k = 1;
				}
			}
			System.out.println();
		}
	}
}
