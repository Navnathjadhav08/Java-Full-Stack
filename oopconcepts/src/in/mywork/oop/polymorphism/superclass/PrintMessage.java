package in.mywork.oop.polymorphism.superclass;

public class PrintMessage {
	
	private String msg;
	
	public PrintMessage() {
		
	}

	public PrintMessage(String msg) {
		//super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public PrintMessage getObj() {
		return new PrintMessage();
	}
	
	

}
