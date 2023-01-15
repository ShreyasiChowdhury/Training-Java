import java.util.Scanner;

class qstn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter ASCII values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " : " + (char) arr[i]);
        }
    }
}