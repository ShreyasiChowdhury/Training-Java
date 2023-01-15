import java.util.Scanner;

class qstn7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1 || arr[i] == 4) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}