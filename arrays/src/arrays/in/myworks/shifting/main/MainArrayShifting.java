package arrays.in.myworks.shifting.main;

import arrays.in.myworks.shifting.ArrayShifting;

public class MainArrayShifting {
	public static void main(String[] args) {
		ArrayShifting shifting = new ArrayShifting();
		
		
		//1. Left Shifting ... 
		
		int[] intArray = {10,20,30,40,50};
		
		System.out.println("Array before Right Shifting "); 
		for(int i = 0;i<intArray.length ; i++)
				System.out.print(intArray[i] + " ");   //element before shifting ...
    
		System.out.println(); 
		System.out.println("Array after Right Shifting "); 
		
		shifting.leftShift(intArray);    //function call
		
		for(int i = 0;i<intArray.length ; i++)
			System.out.print(intArray[i] + " ");       //element after shifting ...
		
		//2.Right Shifting ..
		int[] intArray1 = {110,120,130,140,150};
		System.out.println(); 
		System.out.println();
		
		System.out.println("Array before Right Shifting "); 
		for(int i = 0;i<intArray1.length ; i++)
				System.out.print(intArray1[i] + " ");   //element before shifting ...
    
		System.out.println(); 
		System.out.println("Array after Right Shifting "); 
		
		shifting.rightShift(intArray1);    //function call
		
		for(int i = 0;i<intArray1.length ; i++)
			System.out.print(intArray1[i] + " ");       //element after shifting ...
		
		
	
	}
	
}
