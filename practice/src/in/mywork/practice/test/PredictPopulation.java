package in.mywork.practice.test;

import java.util.Scanner;

public class PredictPopulation {
	public static void main(String[] args) {
//		int n = 4;
//		float cp = 1000;
//		float br=0.5F;
//		float dr=0.1F;
//		float fp = 0;
//		
//		for(int i=0;i<n;i++) {
//			fp= ((cp+(cp*br))-(cp*dr));
//			cp=fp;
//		}
//		
//		System.out.println(Math.round(fp));
		
		int X = 0;
		float N=0F;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextFloat();
		
		int temp = (int) N;
		int sum = 0;
		while(temp!=0) {
			sum = sum+(temp%10);
			temp = temp/10;
		}
		
		X=(int) (N/sum);
		
		System.out.println(X);
		
		
	}
}
