package in.mywork.practice.test;

import java.util.Scanner;

public class text {
	 // Method to concatenate digits of dNum based on the corresponding 1s in bNum
    public static String concateDigits(String dNum, String bNum) {
        String res = "";
        
    
        for (int i = 0; i < dNum.length(); i++) {
            
            if (bNum.charAt(i) == '1') {
                res += dNum.charAt(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        // Call the concateDigits function and print the result
        System.out.println(concateDigits(num1, num2));

        sc.close();
    }
}
