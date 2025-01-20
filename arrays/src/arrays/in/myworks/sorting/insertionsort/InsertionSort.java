package arrays.in.myworks.sorting.insertionsort;

/**
 * 
 */
public class InsertionSort {
	int[] intArray;
	String[] stringArray;
	
	public int[] getIntArray() {
		return intArray;
	}
	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}
	public String[] getStringArray() {
		return stringArray;
	}
	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
		
	}
	
	public void insertionSort() {
		String key;int j;
		for(int i=0;i<stringArray.length;i++) {
			key=stringArray[i];
			j=i-1;
			
			while(j >= 0  && stringArray[j].compareTo(key) > 0) {
				stringArray[j+1] = stringArray[j];
				j--;
			}
			
			stringArray[j+1] = key;
		}
	}
	
	//Toggle Mode Sort
	public void insertionSort2() {
		String key;int j;
		for(int i=0;i<stringArray.length;i++) {
			key=stringArray[i];
			j=i-1;
			
			while(j >= 0  && stringArray[j].toLowerCase().compareTo(key.toLowerCase()) > 0) {
				stringArray[j+1] = stringArray[j];
				j--;
			}
			
			stringArray[j+1] = key;
		}
	}
	
	//for integer
	public void insertionSort3() {
		int key;int j;
		for(int i=0;i<intArray.length;i++) {
			key=intArray[i];
			j=i-1;
			
			while(j >= 0  && intArray[j] > key) {
				intArray[j+1] = intArray[j];
				j--;
			}
			
			intArray[j+1] = key;
		}
	}
	
	
	
	
}
