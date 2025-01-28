package in.mywork.testing.functionalinterfaces;

import java.util.Arrays;
import java.util.function.Supplier;

public class TestSupplierInterface {
	public static void main(String[] args) {
		Supplier<Integer> randomIntSupplier = 
				() ->(int ) (Math.random()*100);
				
				
				
		System.out.println(randomIntSupplier.get());
		
		int[] intArray = new int[10];
		
		for(int i = 0;i<10;i++) {
			intArray[i] = randomIntSupplier.get();
			
		}
		
		System.out.println(Arrays.toString(intArray));
	}
	
	
	
	

}
