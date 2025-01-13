package in.mywork.reversenumber;

public class ReverseNumber {
	int number;
	
	public ReverseNumber() {}
	
	public ReverseNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
//	public int reverseGivenNumber(){
//		
//		int temp = this.number;
//		int reverse =0;
//		int digit = 0;
//		while(temp != 0) {
//			digit = temp % 10;
//			temp = temp/10;
//			reverse = reverse*10+digit;
//			
//		}
//		
//		return reverse;
//	}
	
/* Optimized Code  */	
		public int reverseGivenNumber(){
				
				int temp = this.number;
				int reverse =0;
				//Hint digit = 0;
				while(temp != 0) {
					reverse = reverse*10+temp % 10;
					temp = temp/10;
					
				}
				
				return reverse;
			}
		
		public boolean checkPallindromeNumber() {
			return number == reverseGivenNumber();
		}
	
	
}
