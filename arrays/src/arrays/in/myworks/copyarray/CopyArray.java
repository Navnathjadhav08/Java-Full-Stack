package arrays.in.myworks.copyarray;

public class CopyArray {
	int[] first;
	int[] second;
	
	
	
	public CopyArray(int[] first, int[] second) {
		
		this.first = first;
		this.second = second;
	}
	
	
	public int[] getFirst() {
		return first;
	}
	public void setFirst(int[] first) {
		this.first = first;
	}
	public int[] getsecond() {
		return second;
	}
	public void setsecond(int[] second) {
		this.second = second;
	}
	
	public int[] copyTwoArrays() {
		int[] resultArray = new int[first.length+second.length];
		
		int r=0;
		
		for(int f=0;f<first.length;f++)
			resultArray[r++]=first[f];
		
		for(int s =0;s<second.length;s++) {
			resultArray[r++] = second[s];
		}
		
		return resultArray;
	
	}
	
//	public int[] copyFirstHalfAndSecondHalf() {
//		
//	}
	
	
	

}
