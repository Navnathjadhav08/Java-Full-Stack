package in.mywork.armstrongnumber;

import java.util.Scanner;

public class MainArmstrongNumber {
	
	public static void main(String[] args) {
		ArmStrongNumber armstrongnumber = new ArmStrongNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Integer Number Value : ");
		int variable = scanner.nextInt();
		
		//int var = 153;
		armstrongnumber.setNumber(variable);
		
		if(armstrongnumber.isArmstrongNumber()) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number  is Not Armstrong");
		}
		
		scanner.close();
	}
	
	
}
