package in.mywork.calculatevowel;

public class CalculateVowel {
	
	public String variable;
	
	public CalculateVowel() {}
	
	public CalculateVowel(String variable) {
		this.variable  = variable;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}
	
	public int[] countTheVowel() {
		//int count = 0;
		int[] count=new int[5];
		
		for(int i = 0;i<variable.length();i++) {
			if(variable.charAt(i) == 'a' || variable.charAt(i) == 'A') {
				count[0]++;
			}else if(variable.charAt(i) == 'e' || variable.charAt(i) == 'E') {
				count[1]++;
			}else if(variable.charAt(i) == 'i' || variable.charAt(i) == 'I') {
				count[2]++;
			}else if(variable.charAt(i) == 'o' || variable.charAt(i) == 'I') {
				count[3]++;
			}else if(variable.charAt(i) == 'u' || variable.charAt(i) == 'U') {
				count[4]++;
			}
		}
		
		return count;
	}
	
	public int[] countTheVowel2() {
		//int count = 0;
		int[] count=new int[5];
		
		for(int i = 0;i<variable.length();i++) {
			switch(variable.charAt(i)) {
				case 'a' | 'A' -> count[0]++;
				case 'e' | 'E'-> count[1]++;
				case 'i' | 'I'-> count[2]++;
				case 'o' | 'O'-> count[3]++;
				case 'u' | 'U'-> count[4]++;
			}
		}
		
		return count;
	}
}
