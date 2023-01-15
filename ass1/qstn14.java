//A, Z, X, B, V, T, C, R

import java.util.Scanner;

class qstn14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int n = sc.nextInt();
        int count = 0;
        char ch1 = 'A';
        char ch2 = 'Z';
        for (int i = 1; i <= n; i++) {
            System.out.println(ch1);
            ch1++;
            count++;
            if (count == n)
                break;
            System.out.println(ch2);
            ch2 -= 2;
            count++;
            if (count == n)
                break;
            System.out.println(ch2);
            ch2 -= 2;
            count++;
            if (count == n)
                break;
        }
    }
}
