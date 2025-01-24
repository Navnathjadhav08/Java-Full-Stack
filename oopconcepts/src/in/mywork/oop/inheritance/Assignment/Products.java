package in.mywork.oop.inheritance.Assignment;

public class Products {
	
	float price;
	String Category;
	String Name;
	String origin;
	public Products(float price, String category, String name, String origin) {
		
		this.price = price;
		Category = category;
		Name = name;
		this.origin = origin;
	}
	
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
	

}
