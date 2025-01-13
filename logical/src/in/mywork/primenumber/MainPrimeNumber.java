package in.mywork.primenumber;

import java.util.Scanner;

public class MainPrimeNumber {
	public static void main(String[] args) {
		PrimeNumber primenumber = new PrimeNumber();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Numebr");
		int variable = scanner.nextInt();
		primenumber.setNumber(variable);
		
		scanner.close();
		
		if(primenumber.isPrimeNumber()) {
			System.out.println("Number is Prime Number");
		}else {
			System.out.println("Numebr is not Prime Number");
		}
		
		if(primenumber.isPrimeNumber2()) {
			System.out.println("Number is Prime Number");
		}else {
			System.out.println("Numebr is not Prime Number");
		}
		
		
	}

}
