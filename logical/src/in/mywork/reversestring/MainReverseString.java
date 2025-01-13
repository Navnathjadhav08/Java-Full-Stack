package in.mywork.reversestring;

import java.util.Scanner;

public class MainReverseString {
		public static void main(String[] args) {
			ReverseString reversestring = new ReverseString();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a String");
			String variable = scanner.nextLine();
			
			scanner.close();
			
			reversestring.setVariable(variable);
			
			//String rstr = reversestring.reverseString();
			String rstr = reversestring.reverseStringLine();
			
			System.out.println("the reverse string is "+rstr);
		}
}
