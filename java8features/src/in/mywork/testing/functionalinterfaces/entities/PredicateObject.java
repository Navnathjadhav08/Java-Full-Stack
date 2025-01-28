package in.mywork.testing.functionalinterfaces.entities;

import java.util.function.Predicate;

public class PredicateObject {
	
	
	public static final	Predicate<Fan> validateColor = 
				fan->
					fan.getColor().matches("[A-Z][a-z]+")
					&&
					fan.getColor().length()>=3;
					
	public static final Predicate<Integer> validateMarks = 
			marks -> marks > 35;
}
