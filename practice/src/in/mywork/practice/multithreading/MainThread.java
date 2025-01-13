package in.mywork.practice.multithreading;

public class MainThread {
	public static void main(String[] args) {
		ThreadDemo m1 = new ThreadDemo();
		ThreadDemo m2 = new ThreadDemo();
		
//		Thread t1 = new Thread(m1);
//		Thread t2 = new Thread(m2);
//		
//		t1.start();
//		t2.start();
		
		System.out.println(m1.getClass().hashCode());
	}
	
}
