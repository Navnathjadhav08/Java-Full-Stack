package arrays.in.myworks.sorting.selectionsort;

import java.util.Arrays;

public class MainSelectionSort {
	
	public static void main(String[] args) {
		String[] str = {"vivrk","Rahul","Tejas","Avi"};
		String[] str2 = {"n","A","D","aa"};
		SelectionSort sort = new SelectionSort(str2);
		
		sort.selectionSort2();
		
		System.out.println(Arrays.toString(str2));
		
	}

}
