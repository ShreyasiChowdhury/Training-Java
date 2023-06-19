import java.util.Scanner;

public class qstn1 {
    static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++)
            if (x % i == 0)
                return false;
        return true;
    }

    static boolean isSum(int n, int k) {
        if (n < 2 * k)
            return false;
        if (k == 1)
            return isPrime(n);
        if (k == 2) {
            if (n % 2 == 0)
                return true;
            return isPrime(n - 2);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean[] b = new boolean[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (isSum(n, k))
                b[i] = true;
            else
                b[i] = false;
        }
        for (int i = 0; i < t; i++) {
            if (b[i])
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }
}