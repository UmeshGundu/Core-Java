import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("str1");
		String str1 = scan.nextLine();
		if (str1.isEmpty()) {                                  
			System.out.println("Please enter the string");
			System.exit(0);
			}
		System.out.println("str2");
		String str2 = scan.nextLine();
		Anagrams(str1, str2);
		

	}

	private static void Anagrams(String str1, String str2) {
		
		str1.toLowerCase();
		str2.toLowerCase();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean flag = false;
		if (ch1.length != ch2.length) {
			System.out.println("Please enter correct length of String");
			System.exit(0);
		}
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				flag = true;

			}

		}
		if (flag == false) {
			System.out.println("It is a Anagram");
		} else
			System.out.println("It is not a Anagram");

	}

}