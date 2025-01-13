package in.mywork.singletondesign;
/*
 * Singleton pattern : In this type of design pattern java class return only one object means class object are created only once ...
 * for Db connection we use this pattern
 * 
 */
public class SingletonDemo {
	private static SingletonDemo object1 ;
	private SingletonDemo() {
		
	}
	
	public static SingletonDemo getObject() {
		if(object1 == null) {
			
			object1 = new SingletonDemo();
			return object1;
		}
		
		return object1;
	}

}
