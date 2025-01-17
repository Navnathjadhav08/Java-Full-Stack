package arrays.in.myworks.max;

public class MaxElement {
		
	public int findMaxElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int a:arr) {
			if(a>max) {
				max = a;
			}
		}
		return max;
	}
	
	public int findMinElement(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int a:arr) {
			if(a<min) {
				min = a;
			}
		}
		return min;
	}
}
