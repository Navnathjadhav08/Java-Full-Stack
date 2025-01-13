package in.mywork.presentationlayer;

import java.util.Scanner;

import in.mywork.armstrongnumber.ArmStrongNumber;
import in.mywork.perfectnumber.PerfectNumber;
import in.mywork.primenumber.PrimeNumber;
import in.mywork.reversenumber.ReverseNumber;

public class Helper {
	
	public int printMenu(Scanner scanner) {
		System.out.println("1. to check if Number is Pallindrome");
		System.out.println("2. to check if Number is Armstrong");
		System.out.println("3. to check if Number is PerfectNumber");
		System.out.println("4. to check if Number is Prime");
		System.out.println("0. Exit");
		return scanner.nextInt();
	}
	
	public void checkPallimdromeNumber(Scanner scanner) {
		ReverseNumber number =new  ReverseNumber();
		System.out.println("Enter the number");
		int variable = scanner.nextInt();
		number.setNumber(variable);
		
		if(number.checkPallindromeNumber()) {
			System.out.println("Number is Pallimdrome");
		}else {
			System.out.println("Number is Not Pallimdrome");
		}
	}

	public void checkArmstrongNumber(Scanner scanner) {
		ArmStrongNumber number =new  ArmStrongNumber();
		System.out.println("Enter the number");
		int variable = scanner.nextInt();
		number.setNumber(variable);
		
		if(number.isArmstrongNumber()) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is Not armstrong");
		}
		
	}

	public void checkPerfectNumber (Scanner scanner) {
		PerfectNumber number =new  PerfectNumber();
		System.out.println("Enter the number");
		int variable = scanner.nextInt();
		number.setNumber(variable);
		
		if(number.isPerfectNumber()) {
			System.out.println("Number is Perfect Number");
		}else {
			System.out.println("Number is Not Perfect Number");
		}
		
	}

	public void checkPrimeNumber(Scanner scanner) {
		PrimeNumber number =new  PrimeNumber();
		System.out.println("Enter the number");
		int variable = scanner.nextInt();
		number.setNumber(variable);
		
		if(number.isPrimeNumber()) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is Not prime");
		}
		
	}
	

}
