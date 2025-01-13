package in.mywork.primenumber;

public class PrimeNumber {
	
	public int number;
	
	public PrimeNumber(){
		number = 0;
	}
	
	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean isPrimeNumber() {
			if(number == 2) {
				return true;
			}
			for(int i=2;i<number/2;i++) {
				if(number%2 == 0) {
					return false;
				}
			}
			return true;
		}
	
	public boolean isPrimeNumber2() {
		// Method to check if a number is prime
			int n =number;
	        // Handle edge cases
	        if (n <= 1) return false; // Not prime
	        if (n <= 3) return true;  // 2 and 3 are prime

	        // Check divisibility by 2 and 3
	        if (n % 2 == 0 || n % 3 == 0) return false;

	        // Check divisors from 5 to √n
	        for (int i = 5; i * i <= n; i += 6) {
	            if (n % i == 0 || n % (i + 2) == 0) return false;
	        }

	        return true; // Prime if no divisor found
	    
	}

}
