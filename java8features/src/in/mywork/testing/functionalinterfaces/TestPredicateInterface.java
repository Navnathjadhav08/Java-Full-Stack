package in.mywork.testing.functionalinterfaces;

import java.util.function.Predicate;

import in.mywork.testing.functionalinterfaces.entities.Fan;
import in.mywork.testing.functionalinterfaces.entities.PredicateObject;

public class TestPredicateInterface {
	public static void main(String[] args) {
		
	

//		Predicate<Fan> validateColor = 
//				fan->
//					fan.getColor().matches("[A-Z][a-z]+")
//					&&
//					fan.getColor().length()>=3;
					
					
					
		Fan fan = new Fan("White",4);
					
		boolean result= PredicateObject.validateColor.test(fan);
					
		if(result)
			System.out.println(fan);
		else
			System.out.println("Invalid Color");
		
		boolean isPassed= PredicateObject.validateMarks.test(5);
		
		if(isPassed)
			System.out.println("You Are Passed");
		else
			System.out.println("Yout Are Failed");
	}

}
