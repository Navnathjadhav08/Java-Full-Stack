package in.mywork.oop.polymorphism.main;

import in.mywork.oop.polymorphism.subclass.NumericMessage;
import in.mywork.oop.polymorphism.superclass.PrintMessage;

public class MainPrintMessage {
	
	public static void main(String[] args) {
		PrintMessage pMessage = new PrintMessage();
		
		NumericMessage nMessage = new NumericMessage();
		
		pMessage.setMsg("Hello");
		nMessage.setMsg(40);
		
		System.out.println(pMessage.getMsg());
		System.out.println(nMessage.getMsg());
	}

}
