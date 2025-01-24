package in.mywork.oop.inheritance.subclass;

import in.mywork.oop.inheritance.superclasses.Animal;

public class Dog  extends Animal{
	
	private String breed;
	private int legs;
	
	public Dog() {
		System.out.println("Dog Constructor");
	}
	
	public Dog(String color, int age, String breed, int legs) {
		super(color, age);
		this.breed = breed;
		this.legs = legs;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	
	
	
	
	
	
	
	

}
