import java.util.Scanner;

public class RemoveString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		System.out.println("Enter the Index of an String");
		int index = scan.nextInt();
		removeString(str, index);
	}

	private static void removeString(String str, int index) {
		str.toLowerCase();
		char ch[] = str.toCharArray();
		if (index <= ch.length - 1) {
			System.out.println(str.substring(0, index)+str.substring(index+1));    //ch.length is optional at 2 substring.
		} else {
			System.out.println("Please enter the index in between the length of a string");
		}

	}
}
