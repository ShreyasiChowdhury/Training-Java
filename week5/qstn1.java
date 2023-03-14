import java.util.*;

public class qstn1 {
    public static int decimal(int n) {
        int dec = 0, i = 0;
        while (n > 0) {
            dec += Math.pow(2, i++) * (n % 10);
            n /= 10;
        }
        return dec;
    }

    public static int octal(int n) {
        int dec = decimal(n);
        int oct = 0, i = 0;
        while (dec != 0) {
            oct += ((int) Math.pow(10, i++)) * (dec % 8);
            dec /= 8;
        }
        return oct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(octal(n));
    }
}
