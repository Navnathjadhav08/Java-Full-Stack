package in.mywork.staticdemo;

public class StaticDemo {
	static int variable1 = 0;
	int varianle2;
	

	
	public StaticDemo(int varianle2) {
		
		this.varianle2 = varianle2;
	}

	public int getVarianle2() {
		return varianle2;
	}

	public void setVarianle2(int varianle2) {
		this.varianle2 = varianle2;
	}

	public static int getVariable1() {
		return variable1;
	}

	public static void setVariable1(int variable1) {
		StaticDemo.variable1 = variable1;
	}
	
	

}
