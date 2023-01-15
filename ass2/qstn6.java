import java.util.Scanner;

class qstn6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int counte = 0, counto = n - 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                temp[counte++] = arr[i];
            } else {
                temp[counto--] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
