package in.mywork.practice.test;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading input values
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result=0;
        
       
        if (a > 100 && b > 100) {
            int product = a * b;
            int sum = a + b;
            
          
             result = product - sum;
            
           
            System.out.println(result);
        }
        
        sc.close();
    }
}
