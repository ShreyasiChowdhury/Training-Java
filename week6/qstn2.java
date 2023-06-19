import java.util.*;

public class qstn2 {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 1, 4, 2, 9, 3, 7, 6 };
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        int[] ans = new int[arr.length];
        for (int i = 0, j = n - 1; i <= n / 2 || j > n / 2; i++, j--) {
            if (count < n) {
                ans[count] = arr[i];
                count++;
            }
            if (count < n) {
                ans[count] = arr[j];
                count++;
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(ans[i] + " ");
    }
}