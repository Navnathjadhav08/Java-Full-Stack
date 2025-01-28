package in.mywork.testing.functionalinterfaces;

import java.util.function.Consumer;

import in.mywork.testing.functionalinterfaces.entities.ConsumerObject;
import in.mywork.testing.functionalinterfaces.entities.Fan;

public class TestConsumerInterface {
	
	public static void main(String[] args) {
		
		//Anonymous class
		Consumer<String> consumer = new Consumer<String>(){
			public void accept(String name) {
				System.out.println(name);
			  }
			};
			
			consumer.accept("ABCD");
			
			
		//Lambda Expression
//			Consumer<String> consumer1= 
//					name -> System.out.println("ABCDE");
//			consumer1.accept("ABCDE");
			
			
			//Consumer<String> consumer1= name -> System.out.println("ABCDE");
			ConsumerObject.consumer1.accept("ABCDE");
			
			//Consumer<Integer> intConsumer = var -> System.out.println(var);
			ConsumerObject.intConsumer.accept(785);
			
			
			//Consumer<Fan> fanConsumer = fan -> System.out.println(fan.toString());
			
			Fan fan1 = new Fan("Black",23);
			
			ConsumerObject.fanConsumer.accept(fan1);
			
	}

}
