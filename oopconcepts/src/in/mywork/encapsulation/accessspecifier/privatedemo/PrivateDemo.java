package in.mywork.encapsulation.accessspecifier.privatedemo;

public class PrivateDemo {
	private int variable1;
	private int variable2;
	
	private void setVariable(){
		variable1 = 1;
		variable2 = 1;
	}
	
	public PrivateDemo(int var1,int var2) {
		if(var1 < 0  && var2 <0) {
			setVariable();
		}else {
			variable1 =var1;
			variable2 =var2;
		}
	}
	
	@Override
	public String toString() {
		
		return "variable1 = "+variable1+"variable2 = "+variable2;
	}
	
	
}
