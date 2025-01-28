package in.mywork.testing.functionalinterfaces.entities;

public class Fan {
	private String color;
	private int speed;
	
	public Fan(String color, int speed) {
		//super();
		this.color = color;
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String toString() {
		return color+" "+speed;
		
	}
	 
	
	

}
