package arrays.in.myworks.array2D;

import java.util.Arrays;

public class Araay2D {
	public static void main(String[] args) {
		//int[][] array2d = new int[4][4];  //valid syntax    
		
		//int[] array2d[] = new int[4][4];  //valid syntax
		
		//int[] [] array2d = new int[4][4];  //valid syntax
		
		int[] array2d[] = new int[4][4];     //valid syntax
		
		//int[] array2d[] = new [4]int[4];     //Invalid syntax ....*************
		
		int[][] array2d1 = {{1,2,3},{3,5,4},{56,87,1}};   //valid
		
		System.out.println(Arrays.deepToString(array2d1));
		
		int[][] array2d2 = new int[][] {{1,2,3},{3,5,4},{56,87,1}};   //valid
		
		System.out.println(Arrays.deepToString(array2d2));
		
		
		//Jagged Arrays
		
		int[][] arrayJagged= new int[3][];
		
		arrayJagged[0] = new int[] {1};
		arrayJagged[1] = new int[] {1,2};
		arrayJagged[2] = new int[] {1,2,3};
		
		System.out.println("Jagged Array");
		//print using utility Arrays class method deepToString
 		System.out.println(Arrays.deepToString(arrayJagged));
		
		
		//print using adv for loop
		for(int i[]:arrayJagged) {
			System.out.print("{");
			for(int j:i) {
				System.out.print(j+",");
			}
			System.out.print("}");
		}
		
		
		
		
		
	}

}
