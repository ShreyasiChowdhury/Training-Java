import java.util.Scanner;
import java.util.Arrays;

class qstn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Largest two elements: "
                + arr[n - 1] + ", " + arr[n - 2] + "\n");
        System.out.print("Smallest two elements: "
                + arr[1] + ", " + arr[0] + "\n");
    }
}