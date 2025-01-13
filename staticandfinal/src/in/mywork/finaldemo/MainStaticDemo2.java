package in.mywork.finaldemo;

public class MainStaticDemo2 {
		public static void main(String[] args) {
//			StaticDemo staticDemo = new StaticDemo();
//			
//			staticDemo.setVariable(10);
			
			// No need to create Object for static variable & method
			
			StaticDemo.setVariable(20);
			
			int result = StaticDemo.getVariable();
			
			System.out.println(result);
		}
}
