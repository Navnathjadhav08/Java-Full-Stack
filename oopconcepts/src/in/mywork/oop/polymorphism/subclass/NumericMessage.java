package in.mywork.oop.polymorphism.subclass;

import in.mywork.oop.polymorphism.superclass.PrintMessage;

public class NumericMessage extends PrintMessage {
	private int msg;
	
	public NumericMessage() {
		
	}

	public NumericMessage(int msg) {
		//super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg+"";
	}

	public void setMsg(int msg) {
		this.msg = msg;
	}
	
	
	public PrintMessage getObj() {
		return new PrintMessage();
	}
	
	

}
