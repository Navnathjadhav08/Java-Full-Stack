package in.mywork.oop.inheritance.main;

import in.mywork.oop.inheritance.subclass.Cat;
//import in.mywork.oop.inheritance.subclass.Dog;

public class MainDogAnimal {
	public static void main(String[] args) {
//		Dog pintu = new Dog("Red", 10,"German Shephard",2);
//		
//		System.out.println(pintu.getColor());
//		System.out.println(pintu.getBreed());
//		System.out.println(pintu.getLegs());
		
		Cat rechal = new Cat("Diamond Black",300,"Indian cat",true);
		
		System.out.println(rechal.getAge());
		System.out.println(rechal.getType());
		
		
		
	}
	

}
