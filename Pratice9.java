import java.util.Scanner;

public class Pratice9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		printnumber(n);
	}

	private static void printnumber(int n1) {
		String s="";
		while(n1!=0) {
			int rem=n1%10;
			n1=n1/10;
			s+=rem;
		}
			for(int i=s.length()-1;i>=0;i--) {
		switch (s.charAt(i)) {
		case ('0'):
			System.out.print("Zero ");
			break;
		case ('1'):
			System.out.print("One ");
			break;
		case ('2'):
			System.out.print("Two ");
		    break;
		case ('3'):
			System.out.print("Three ");
			break;
		case ('4'):
			System.out.print("Four ");
			break;
		case ('5'):
			System.out.print("Five ");
			break;
		case ('6'):
			System.out.print("Six ");
			break;
		case ('7'):
			System.out.print("Seven ");
			break;
		case ('8'):
			System.out.print("Eight ");
			break;
		case ('9'):
			System.out.print("Nine ");
			break;

		}
		}
	}
}