package in.mywork.perfectnumber;

import java.util.Scanner;

public class MainPerfectNumber {
	
	public static void main(String[] args) {
		PerfectNumber perfectnumber = new PerfectNumber();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int variable = scanner.nextInt();
		perfectnumber.setNumber(variable);
		
		if(perfectnumber.isPerfectNumber()) {
			System.out.println(variable+" is Perfecct Number");
			
		}else {
			System.out.println(variable+"is Not Perfect Numeber");
		}
		
		
		scanner.close();
		
		
	}

}
