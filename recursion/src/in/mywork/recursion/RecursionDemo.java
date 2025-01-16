package in.mywork.recursion;

public class RecursionDemo {
	
	int number;
	
	RecursionDemo(){
		number =0;
	}
	
	RecursionDemo(int number){
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int printFibSeries(int i) {
		
		if(i ==1 || i == 0) {
			return i;
		}
		
		int fib1 = printFibSeries(i -1);
		int fib2 = printFibSeries(i-2);
		
		
		return(fib1+fib2);
		
		
	}

}
