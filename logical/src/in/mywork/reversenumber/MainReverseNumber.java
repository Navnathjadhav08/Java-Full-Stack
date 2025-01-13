package in.mywork.reversenumber;

public class MainReverseNumber {
	public static void main(String[] args) {
		ReverseNumber reversenumber = new ReverseNumber(123);
		
		int ret = reversenumber.reverseGivenNumber();
		System.out.println(ret);
		
		boolean bret = reversenumber.checkPallindromeNumber();
		
		System.out.println((bret == true)? ("Number is Pallindrome"): ("Number is not Pallindrome"));
		
		
	}
}
