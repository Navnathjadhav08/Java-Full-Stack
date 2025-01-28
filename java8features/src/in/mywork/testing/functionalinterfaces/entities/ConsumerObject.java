package in.mywork.testing.functionalinterfaces.entities;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerObject {
	
	public static final Consumer<String> consumer1= name -> System.out.println("ABCDE");
	
	
	public static final Consumer<Integer> intConsumer = var -> System.out.println(var);
	
	
	
	public static final Consumer<Fan> fanConsumer = fan -> System.out.println(fan.toString());



	
	
			

}
