import java.util.Scanner;

class qstn11 {
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
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 10) {
                temp[k++] = arr[i];
            }
        }
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}