package com.myproject.hello;

public class Main {
	public static void main(String a[]) {
		Hello hobject = new Hello();
		hobject.Display();
		System.out.println("hi");
		int i = 3;
		
		int c= 5;
		int b= 3;
		
		//System.out.println(result);
		i = (c > b) ? c : b;
		System.out.println(i);
		
		boolean flag = false;
		flag = (10>7)? ((10>8)? true:false) : ((7>8)?true:false);
		
		
		
	}
}
