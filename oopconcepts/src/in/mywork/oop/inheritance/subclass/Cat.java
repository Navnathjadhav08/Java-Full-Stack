package in.mywork.oop.inheritance.subclass;

import in.mywork.oop.inheritance.superclasses.Animal;

public class Cat extends Animal{

	String type;
	boolean isWild;
	public Cat(String type, boolean isWild) {
		//super();
		this.type = type;
		this.isWild = isWild;
	}
	
	public Cat(String color,int age,String type, boolean isWild) {
		super(color,age);
		this.type = type;
		this.isWild = isWild;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public boolean isWild() {
		return isWild;
	}
	
	public void setWild(boolean isWild) {
		this.isWild = isWild;
	}
	
	
}
