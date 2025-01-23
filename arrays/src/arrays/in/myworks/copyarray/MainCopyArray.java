package arrays.in.myworks.copyarray;

import java.util.Arrays;

public class MainCopyArray {
	public static void main(String[] args) {
		int[] first = {5,6,3,23};
		int[] second = {5,34,54,45};
		CopyArray copy = new CopyArray(first,second);
		
		int[] result=copy.copyTwoArrays();
		
		System.out.println(Arrays.toString(result));
	}
}
