package com.myproject.hello;

class LargestAmongThree{
	int number1,number2,number3;
	
	public void setter(int num1,int num2,int num3) {
		this.number1 = num1;
		this.number2 = num2;
		this.number3 = num3;
	}
	
	public int getLargest() {
		
		return (this.number1 > this.number2)? (this.number1>this.number3)? this.number1:this.number3 :(this.number2>this.number3)?this.number2:this.number3;
	}
	
	
}

public class MainLargestAmongThree {
	
	
	
	public static void main(String[] args) {
		
		LargestAmongThree lobject = new LargestAmongThree();
		
		lobject.setter(10, 17, 116);
		
		int maxnumber = lobject.getLargest();
		System.out.println(maxnumber);
		
		
	}

}
