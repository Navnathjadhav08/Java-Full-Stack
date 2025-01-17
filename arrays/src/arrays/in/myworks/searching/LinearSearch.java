package arrays.in.myworks.searching;

public class LinearSearch {
	
	public int linearSearch(int[] intArray,int target) {
		int i = 0;
		for(int element:intArray) {
			if(element==target) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
