package in.mywork.practice.multithreading;

public class ThreadDemo extends Thread {


	
	 public void run() {
		for(int i=1;i<1000;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}


