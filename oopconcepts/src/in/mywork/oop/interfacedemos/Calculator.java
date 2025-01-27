package in.mywork.oop.interfacedemos;

@FunctionalInterface
//only when interface have Single Abstract Method(SAM) called as Functional Interface
public interface Calculator {
	
	//int var0;    //not allowed
	//int var1 = 0;   //allowed but not used
	
	public static final int VAR = 100;
	
//	public void calculate0();  // compiler add abstract when we not define
//	void calculate1();  // compiler add public & abstract  when we not define
	
	public abstract int calculate(int number1,int number2);
	
	public default void printMessage(String message) {  //compile adds public modifier
		printMyMessage(message);
	}
	
	private void printMyMessage(String message) { // compiler not add public modifier
		System.out.println(message);
	}
	
	public static void printVar() {
		System.out.print(VAR);
	}
	
	
	

}
