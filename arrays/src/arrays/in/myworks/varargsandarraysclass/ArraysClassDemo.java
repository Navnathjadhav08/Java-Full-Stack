package arrays.in.myworks.varargsandarraysclass;

import java.util.Arrays;
public class ArraysClassDemo {
	public static void main(String[] args) {
		int[] array = new int[5];
		
		//System.out.println(Arrays.toString(array));
		print(1,array);
		
		Arrays.fill(array, 1,4,10);   //fill(array re,start index,end index,which element get filled)
		
		System.out.println(Arrays.toString(array));
		print(1,array);
	}
	
	
	public static void print(int length,int... arr){
		
			System.out.println(Arrays.toString(arr));
		}

}