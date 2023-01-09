
// power of number
import java.util.Scanner;

class qstn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.println("Enter power:");
        int p = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= p; i++) {
            res = n * res;
        }
        System.out.println("Answer: " + res);
    }
}