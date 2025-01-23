package arrays.in.myworks.objectarray;

public class MainStudent {
	public static void main(String[] args) {
		Student[] studentArray = new Student[5];
		
		studentArray[0] =new Student();
		studentArray[0].setName("ABC");
		System.out.println(studentArray[0].getName());
		
	}

}
