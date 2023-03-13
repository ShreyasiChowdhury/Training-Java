import java.util.*;

public class qstn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = i;
        }
        System.out.println("Enter array elements:");
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int x = -1;
        for (int i = 0; i < n; i++) {
            x = -1;
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    x = 0;
                    break;
                }
            }
            if (x == -1)
                arr1[i] = x;
        }
        System.out.println("Output:");
        for (int val : arr1) {
            System.out.print(val + " ");
        }
    }
}
