package in.mywork.testing.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

import in.mywork.testing.functionalinterfaces.entities.Fan;

public class MethodReferencingConsumerAndSupplier {
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		
//		Consumer<String> fanColorConsumer = color -> fan1.setColor(color);
		Consumer<String> fanColorConsumer = fan1::setColor;
		
		fanColorConsumer.accept("Brown");
		
//		Supplier<String> fanColorSupplier = () ->fan1.getColor();
		Supplier<String> fanColorSupplier = fan1::getColor;
		
		String fanColor = fanColorSupplier.get();
		
		
		//for fan speed
		Consumer<Integer> fanSpeedConsumer = fan1::setSpeed;
		fanSpeedConsumer.accept(100);
		Supplier<Integer> fanSpeedSupplier = fan1::getSpeed;
		fanSpeedSupplier.get();
		
		int  fanSpeed= fanSpeedSupplier.get();
		System.out.println(fanSpeed);
		
		
		
		
		
		System.out.println(fanColor);
		
		DoubleSupplier a=() -> Math.random();
		System.out.println(a.getAsDouble() *100);
	} 

}
