import java.util.Scanner;

class qstn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched:");
        int key = sc.nextInt();
        int flag = 0, loc = '\0';
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                flag = 1;
                loc = i + 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Element " + key +
                    " found in " + loc + " position");
        else
            System.out.println("Element " + key + " not found");
    }
}