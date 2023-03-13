import java.util.Scanner;

public class qstn1 {
	public static int findMax(int arr[], int n) {
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n = sc.nextInt();
		System.out.println("Enter first array elements:");
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter second array elements:");
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		int max1 = findMax(arr1, n);
		int max2 = findMax(arr2, n);
		System.out.println("Sum: " + (max1 + max2));
	}
}
