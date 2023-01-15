import java.util.Scanner;

class qstn12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        outer: for (int i = 0; i < n; i++) {
            if (arr[i] == 6) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == 7) {
                        i = j;
                        continue outer;
                    }
                }
            }
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
    }
}