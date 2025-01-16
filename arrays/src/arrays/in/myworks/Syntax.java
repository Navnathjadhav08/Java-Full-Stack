package arrays.in.myworks;

public class Syntax {
	public static void main(String[] args) {
		//1 declaration
		int name[];
		
		name = new int[4];
		
		//2
		int []name1;
				
		name1 = new int[4];
		
		//3
		int[] name2;
				
		name2= new int[4];
		
		//4
	    int[][] name3;
						
		name3= new int[4][4];
		
		//5
	    int[] name4[];
						
		name3= new int[4][4];
		
		//6
	    int name5[][];
						
		name5= new int[4][4];
		
		//initialization
		name[0] = 410;
		
		int[] name0 = {10,20,30,40}; //member initialization list
		
		//access elements
		System.out.println(name[0]);
		System.out.println(name[1]);
		
		//print size of arrays
		System.out.println(name.length);
		//name.length = 12;               note: length is property which is final field so we can't change it.. 
		
		
		
		
		
	}
}
