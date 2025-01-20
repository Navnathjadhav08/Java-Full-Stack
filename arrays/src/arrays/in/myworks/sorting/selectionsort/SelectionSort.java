package arrays.in.myworks.sorting.selectionsort;

public class SelectionSort {
	
	String[] stringArray;
	
	
	public SelectionSort(String[] stringArray) {
		
		this.stringArray = stringArray;
	}
	
	


	public String[] getStringArray() {
		return stringArray;
	}




	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}




	public void selectionSort() {
		int key;String temp;
		for(int i=0;i<stringArray.length;i++) {
			key = i;
			for(int j=i+1;j<stringArray.length;j++) 
				if(stringArray[key].compareTo(stringArray[j]) > 0) 
					key = j;
			
			
			temp=stringArray[i];
			stringArray[i]= stringArray[key];
		    stringArray[key]=temp;
		}	
	}
	
	
	//Toggle mode 
	public void selectionSort2() {
		int key;String temp;
		for(int i=0;i<stringArray.length;i++) {
			key = i;
			for(int j=i+1;j<stringArray.length;j++) 
				if(stringArray[key].toLowerCase().compareTo(stringArray[j].toLowerCase()) > 0)
					key = j;
			
			
			temp=stringArray[i];
			stringArray[i]= stringArray[key];
		    stringArray[key]=temp;
		}	
	}
	
	//For Integer 
		public void selectionSort3(int[] intArray) {
			int key;int temp;
			for(int i=0;i<intArray.length;i++) {
				key = i;
				for(int j=i+1;j<intArray.length;j++) 
					if(intArray[key] > intArray[j])
						key = j;
				
				
				temp=intArray[i];
				intArray[i]= intArray[key];
				intArray[key]=temp;
			}	
		}

}
