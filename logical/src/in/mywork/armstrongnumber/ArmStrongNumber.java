package in.mywork.armstrongnumber;

public class ArmStrongNumber {
	
	public int number ;
	
	public ArmStrongNumber(){
		number =0;
	}
	
	ArmStrongNumber(int number){
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public int countOfDigits() {
		int count = 0;
		int temp = number;
		
		while(temp!=0){
			
			temp /=10;
			count++;
			
		}
		return count;
		
	}
	
	public int findPowerOfDigit(int digit,int count) {
		int power =1;
		
		for(int i = 0;i<count;i++) 
			power*=digit;
		
		
		return power;
	}
	
	public boolean isArmstrongNumber() {
		int count = countOfDigits();
		
		int temp = number;
		
		int armstrong = 0;
		
		while(temp != 0) {
			armstrong += findPowerOfDigit(temp%10,count);
			temp /=10;
		}
		
		return number == armstrong;
		
	}
	
	
	

}
