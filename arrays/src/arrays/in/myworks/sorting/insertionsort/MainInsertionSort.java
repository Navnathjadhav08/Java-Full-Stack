package arrays.in.myworks.sorting.insertionsort;

import java.util.Arrays;

public class MainInsertionSort {
	public static void main(String[] args) {
		
		//String[] str = {"vivrk","Rahul","Tejas","Avi"};
		//String[] str2 = {"n","A","D","aa"};
		
		int[] intArray = {60,14,10,1,3,6};
		
		
		
		InsertionSort sort = new InsertionSort();
		
		//sort.setStringArray(str);
		//sort.setStringArray(str2);
		//sort.insertionSort2();
		
		sort.setIntArray(intArray);
		sort.insertionSort3();
		
		System.out.println(Arrays.toString(intArray));
	}
}
