import java.util.Scanner;

class qstn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n];
        int i, j, count = 0;
        System.out.println("Enter elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < count; j++) {
                if (arr[i] == temp[j])
                    break;
            }
            if (j == count) {
                temp[count] = arr[i];
                count++;
            }
        }
        System.out.println("Array:");
        for (i = 0; i < count; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}