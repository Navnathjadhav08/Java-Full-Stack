package in.mywork.java8feature.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStreamApi {
	
	public static void main(String[] args) {
		/*
		 * Filter
		 * 
		 */
		//int[] intArray = {1,2,3,4,5,6,7,8,9,10};
		
		//IntStream intStream = Arrays.stream(intArray);
		
		//Stream<Integer> intStream = Stream.of(1,2,3,4,5,6,7,8,9,0);
		
		// // filter(Predicate or boolean expression as argument)
		//intStream.filter(no -> no%2==0).forEach(System.out::println);
		
		
		//for even number  
//		intStream
//			.filter(no -> no%2==0)
//				.forEach(System.out::println);
		
		//for prime numbers  // at one time one operation is permitted on same stream object
//		intStream
//		 .filter(no -> {
//			 if(no < 2) {
//				 return false;
//			 }
//			 for(int i=2;i<=Math.sqrt(no);i++) {
//			 if(no%i == 0)
//				 return false;
//		 }
//		return true;})
//			.forEach(System.out::println);
		
		/*
		 * 
		 * MAP
		 * Map+FILTRE
		 */
		
		
		//map(Function as Argument)
		Stream<String> nameStream = Stream.of("Vivek","Jayesh","Tejas","Suyash","abs","java","jenny","jugga");
		
		

		
//		nameStream.
//			map(name -> {
//					if(name.length()%2==0)
//						return name;
//					return null;
//				} )
//					.filter(name->name!=null)
//						.forEach(System.out::println);
//		
		
		Stream<String> nameStream2 = Stream.of("Vivek","Jayesh","Tejas","Suyash","abs","java","jenny","jugga");
		
		nameStream2.filter(name -> name.charAt(0) == 'j' || name.charAt(0) == 'J')
							.sorted()
								.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
	}

}
