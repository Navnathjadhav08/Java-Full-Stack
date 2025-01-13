package in.mywork.calculatevowel;

import java.util.Scanner;

public class MainCaculateVowel {
	
	public static void main(String[] args) {
		CalculateVowel calculatevowel = new CalculateVowel();
		
		System.out.println("Enter a String to calculate the Vowel");
		
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		calculatevowel.setVariable(str);
		
		int[] arr ;
		arr= calculatevowel.countTheVowel();
		
		System.out.println("A repeats "+ arr[0]+" Times");
		System.out.println("E repeats "+ arr[1]+" Times");
		System.out.println("I repeats "+ arr[2]+" Times");
		System.out.println("O repeats "+ arr[3]+" Times");
		System.out.println("U repeats "+ arr[4]+" Times");
	}

}
