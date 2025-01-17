package arrays.in.myworks.searching;

public class BinarySearch {
	
	public int binarySearch(int[] intArray,int target) {
		
		int first = 0;
		int last = intArray.length;
		int mid ;
		
		while(first < last) {
			mid = (first+last)/2;
			if(target == intArray[mid]) {
				return mid;
			}else if(target < intArray[mid]) {
				last = mid-1;
			}else if(target > intArray[mid]) {
				first=mid+1;
			}
			
		}
		
		return -1;
	}

}
