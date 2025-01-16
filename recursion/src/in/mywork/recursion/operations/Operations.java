package in.mywork.recursion.operations;

public class Operations {
	
	public int calculateSum(int number) {
		if(number < 0) {
			return 1;
		}
		
		return 5+calculateSum(number-1);
	}
	
	public int calculateFact(int number) {
		if(number <= 0) {
			return 1;
		}
		
		return number*calculateFact(number-1);
	}
	
	public int calculatePower(int base,int exp) {
		if(exp <= 0) {
			return 1;
		}
		
		return base*calculatePower(base,exp-1);
	}
	
	public int calculatePower1(int base,int exp) {
		if(exp == 1) {
			return base;
		}
		
		return base*calculatePower1(base,exp-1);
	}
	
	public int calculatePower2(int base,int exp) {
//		if(exp == 1) {
//			return base;
//		}
//		
//		return base*calculatePower1(base,exp-1);
		return (exp == 1)? base: base* calculatePower2(base,exp-1);
	}
	
	public boolean isPrime(int no,int divisor) {
		if (no < 2 ) 
			return false;
		
			else if(divisor*divisor > no)
				return true;
		
				else if(no % divisor == 0) 
					return false;
		
		
		return isPrime(no,++divisor);
	
	}
	
	public void printTable(int table,int limit) {
		if(limit >= 2) {
			printTable(table,limit-1);
		}
		
		
		System.out.println(table*limit);
		
		
	}
}
