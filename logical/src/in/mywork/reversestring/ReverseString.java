package in.mywork.reversestring;

public class ReverseString {
	
	String variable;
	
	public ReverseString() {}
	
	public ReverseString(String variable) {
		this.variable = variable;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}
	
	public String reverseString() {
		char[] charArray = variable.toCharArray();
		int left = 0,right =charArray.length-1;
		char ch = 'a';
		
		while(left<=right) {
			ch = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = ch;
			
			left++;
			right--;
			
			
		}
		return new String(charArray);
	}
	
	public String reverseStringLine() {
		String[] stringArray = variable.split(" ");
		
		int left = 0;
		int  right =stringArray.length-1;
		String ster = " ";
		
		while(left<right) {
			ster = stringArray[left];
			stringArray[left] = stringArray[right];
			stringArray[right] = ster;
			
			left++;
			right--;
			
			
		}
		return String.join(" ", stringArray);
			
		
		
	}

}
