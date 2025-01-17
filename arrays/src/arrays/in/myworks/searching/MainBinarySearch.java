package arrays.in.myworks.searching;

public class MainBinarySearch {
		public static void main(String[] args) {
			int[] intArray = {12,45,45,44,7,58};
			BinarySearch search = new BinarySearch();
			int ret = -1;
			ret = search.binarySearch(intArray, 454);
			
			if(ret >= 0 ) {
				System.out.println("Number is Present at "+ret+" position");
				
			}else {
				System.out.println("Number is not present");
			}
			
		}
}
