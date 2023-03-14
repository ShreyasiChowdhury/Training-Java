import java.util.*;

public class qstn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        System.out.println("Enter array element:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Output:");
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n - 1; i >= n / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}