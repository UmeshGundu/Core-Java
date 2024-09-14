import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string value");
		String str = scan.nextLine();
		boolean flag = StringPalindrome(str);
		StringPalindrome(str);
		if (flag == false)
			System.out.println(str + ": is  not a palindrome");

		else
			System.out.println(str + ": is a palindrome");

	}

	private static boolean StringPalindrome(String str) {

		str.toLowerCase();
		char[] ch = str.toCharArray();
		boolean flag = true;
		for (int i = 0, j = ch.length - 1; i < ch.length / 2; i++, j--) {
			if (ch[i] != ch[j]) {
				flag = false;
				break;

			}

		}
		if (str == null) {
			System.out.println(str + " : is not a palindrome");
			System.exit(0);
		}
		if (str.isEmpty()) {
			System.out.println("Please enter a String");
			System.exit(0);
		}

		return flag;

	}
}