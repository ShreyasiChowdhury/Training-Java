import java.util.Scanner;

class qstn8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row numbers:");
        int n = sc.nextInt();
        int arr[][] = new int[n][3];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i][3 / 2];
        }
        System.out.println("New Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
