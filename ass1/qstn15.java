//BCA1, BCB2, BCC3, BCD4

import java.util.Scanner;

class qstn15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range:");
		int n = sc.nextInt();
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			System.out.print("BC" + ch + "" + i + ", ");
			ch++;
			if (i % 26 == 0)
				ch = 'A';
		}
	}
}
