package arrays.in.myworks.sorting.bubblesort;

import java.util.Arrays;

public class MainBubbleSort {
		public static void main(String[] args) {
			
			String[] names = {"zebra","Vivek","Suyash","Tejas","vaibhav"};
			BubbleSort sort = new BubbleSort(names);
			
			System.out.println("Before Sorting");
			System.out.println(Arrays.toString(names));
			sort.bubbleSort2();
			
			System.out.println("after Sorting");
			System.out.println(Arrays.toString(names));
		}
}
