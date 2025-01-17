package arrays.in.myworks.searching;

public class MainLinearSearch {
		public static void main(String[] args) {
			int[] intArray = {12,45,45,44,7,58};
			LinearSearch search = new LinearSearch();
			int ret = -1;
			ret = search.linearSearch(intArray, 44);
			
			if(ret >= 0 ) {
				System.out.println("Number is Present at "+ret+" position");
				
			}else {
				System.out.println("Number is not present");
			}
			
		}
}
