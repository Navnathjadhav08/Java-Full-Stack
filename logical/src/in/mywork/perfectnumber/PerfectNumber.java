package in.mywork.perfectnumber;

public class PerfectNumber {
	public int number;
	
	
	public PerfectNumber(){
		number =0;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public boolean isPerfectNumber() {
		if(number<0) {
			return false;
		}
		int count = 0;
		for(int i = 1;i <= number/2; i++) {
			if(number%i == 0) {
				count += i;
			}
		}
		
		return count == number;
	}
}
