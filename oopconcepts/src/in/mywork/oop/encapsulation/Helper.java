package in.mywork.oop.encapsulation;

 class Helper {
	 public static void printDigit() {
		 PrintDigit printdigit=new PrintDigit();
		 
		 printdigit.setNumber1(10);
		 
		 System.out.println(printdigit.getNumber1());
		 
	 }
	 
	 public static void printString() {
		 PrintString printString=new PrintString();
		 
		 printString.setStr("nirmal");
		System.out.println(printString.getStr()); 
		 
		 
		 
	 }
}
