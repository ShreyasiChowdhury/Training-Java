import java.util.*;

public class qstn3 {
    static void fibonacci(int n) {
        int i, a = 0, b = 1, c;
        for (i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }

    static void prime(int n) {
        int i, j, flag, count = 0;
        for (i = 2; i <= 100; i++) {
            flag = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                count++;
            if (count == n) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1)
            fibonacci(n / 2 + 1);
        else
            prime(n / 2);
        sc.close();
    }
}