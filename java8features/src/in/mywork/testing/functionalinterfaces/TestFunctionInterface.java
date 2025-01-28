package in.mywork.testing.functionalinterfaces;

import java.util.function.Function;

public class TestFunctionInterface {
	public static void main(String[] args) {
		//simple
		Function<String,Integer> lengthFunction = 
				(String name) -> {return name.length();};
		
		//Optimized
		Function<String,Integer> lengthFunction1 = 
						name->  name.length();
						
		int length = lengthFunction.apply("Ashish");
		System.out.println(length);
		
		int length1 = lengthFunction1.apply("Ashish");
		System.out.println(length1);
		
		//Optimized pro max
		Function<Integer,Float> generateBill = units -> (float)(units*23);
		System.out.println(generateBill.apply(10));
	}
		
}
