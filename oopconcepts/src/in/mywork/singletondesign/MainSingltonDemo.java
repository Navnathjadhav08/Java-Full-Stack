package in.mywork.singletondesign;

public class MainSingltonDemo {
	public static void main(String[] args) {
		SingletonDemo obj3 = SingletonDemo.getObject();
		System.out.println(obj3);
		
		SingletonDemo obj4 = SingletonDemo.getObject();
		System.out.println(obj4);
		
		System.out.println(obj3 == obj4);
	}
}
