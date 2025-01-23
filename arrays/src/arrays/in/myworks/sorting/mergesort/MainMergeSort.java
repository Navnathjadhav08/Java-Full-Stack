package arrays.in.myworks.sorting.mergesort;

import java.util.Arrays;

public class MainMergeSort {
	public static void main(String[] args) {
		int[] arr = {55,4,2,7,6,9,1,5,7,};
		MergeSort sort = new MergeSort(arr);
		
		
		
		System.out.println(Arrays.toString(arr));
		
		sort.mergeSort(0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
		
}
