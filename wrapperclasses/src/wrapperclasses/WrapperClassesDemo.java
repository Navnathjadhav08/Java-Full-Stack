package wrapperclasses;

public class WrapperClassesDemo {
	public static void main(String[] args) {
		//depricate from SE VERSION 9
		// Integer var1 = new Integer(10);
		
		//Boxing
		Integer var2 = Integer.valueOf(10);
		
		//Unboxing
		int var3 = var2.intValue();
		
		System.out.println(var3);
		
		
		//Autoboxing and Unboxing
		int var01 = 10;
		Integer var4 = var01;
		int var5 =var4;
		System.out.println(var5);
		
		System.out.println(Integer.MAX_VALUE);
		
		//parseXXX(static method)
		int parseResult = Integer.parseInt("456");
		System.out.println(parseResult);
		
		int parseResult1 = Integer.parseInt("11010100",10 );
		System.out.println(parseResult1);
		
		float parseFloatResult = Float.parseFloat("4564");
		System.out.println(parseFloatResult);
		
		//XxxValue
		int intValueResult = var4.intValue();
		
		float floatValueResult = var4.floatValue();
		
		
		
	}
	
	
}
