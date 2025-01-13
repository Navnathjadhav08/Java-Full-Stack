package in.mywork.presentationlayer;

import java.util.Scanner;

public class MainMenuDriven {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Helper helper = new Helper();
		
		int option = 0;
		
		do {
			option = helper.printMenu(scanner);
			
			System.out.println(option);
			
			switch(option) {

				case 1: helper.checkPallimdromeNumber(scanner);
					break;
				case 2: helper.checkArmstrongNumber(scanner);
					break;
				case 3: helper.checkPerfectNumber(scanner);
					break;
				case 4: helper.checkPrimeNumber(scanner);
					break;
				case 0: System.out.println("THANKU FOR USING OUR APPLICATION");
					break;
				default: System.out.println("Enter Valid Input");
			}
			
		}while(option != 0);
	}

}
