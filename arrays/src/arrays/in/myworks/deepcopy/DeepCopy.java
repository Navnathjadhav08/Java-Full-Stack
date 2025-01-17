package arrays.in.myworks.deepcopy;

import java.util.Arrays;

public class DeepCopy {
	
	public void copyEachElement(int[] srcArray) {
		int[] destArray=new int[srcArray.length];
		
		for(int i= 0;i<srcArray.length;i++)
			destArray[i]=srcArray[i];
		
		System.out.println("SourceArray");
		for(int num:srcArray) 
			System.out.print(num + "\t");
		
		System.out.println();
		System.out.println("Destination Array");
		System.out.println(Arrays.toString(destArray));
	}

}
