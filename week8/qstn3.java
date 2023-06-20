import java.util.*;

public class qstn3 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 15, 6, 10, 2 };
        Arrays.sort(arr);
        int k = 16, ele = 0;
        for (int i = 0; i < arr.length; i++) {
            ele = k - arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == ele) {
                    System.out.println(arr[i] + " " + arr[j]);
                    break;
                }
            }
        }
    }
}