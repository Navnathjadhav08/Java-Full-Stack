package arrays.in.myworks.sorting.mergesort;

public class MergeSort {
	
	int[] intArray;

	public MergeSort(int[] intArray) {
		
		this.intArray = intArray;
	}

	public int[] getIntArray() {
		return intArray;
	}

	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}
	
	
	public void mergeSort(int left,int right) {
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(left,mid);
			mergeSort(mid+1,right);
			merge(left,mid,right);
		}
	}

	private void merge(int left, int mid, int right) {
		// TODO Auto-generated method stub
		int firstArraySize = mid-left+1;
		int secondArraySize = right-mid;
		
		int[] firstArray = new int[firstArraySize];
		int[] secondArray = new int[secondArraySize];
		
		for(int i=0; i<firstArraySize;i++) 
			firstArray[i] = intArray[left+i];
		
		for(int j=0; j<secondArraySize;j++)
			secondArray[j]=intArray[mid+1];
		
		int f=0;
		int s=0;
		int r=left;
		
		while(f<firstArraySize && s<secondArraySize) {
			if(firstArray[f] < secondArray[s])
				intArray[r++] = firstArray[f++];
			
			else
				intArray[r++] = secondArray[s++];
			
		}
		
		while(f<firstArraySize)
			intArray[r++] = firstArray[f++];
		
		
		while(s<secondArraySize)
			intArray[r++] = secondArray[s];
		
		
	}

}
