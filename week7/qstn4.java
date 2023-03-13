import java.util.Scanner;

public class qstn4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word:");
		String str = sc.next();
		str = str.toUpperCase();
		char word[] = str.toCharArray();
		char arr[] = { 'A', 'E', 'I', 'O', 'U' };
		int count = 0;
		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (word[i] == arr[j])
					count++;
			}
		}
		System.out.println(count);
		System.out.println(str);
		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i]);
		}
	}
}
