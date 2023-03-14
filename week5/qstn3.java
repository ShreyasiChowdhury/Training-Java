import java.util.Scanner;

public class qstn3 {
    public static boolean checkPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        int[] b = new int[t];
        int[] sum = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            sum[i] = 0;
        }
        for (int i = 0; i < t; i++) {
            for (int j = a[i]; j <= b[i]; j++) {
                if (checkPrime(j))
                    sum[i] += j;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(sum[i]);
        }
    }
}
