package in.mywork.oop.inheritance.Assignment;

public class ElectronicsProducts extends Products{
		String brand;
		String warrenty;
		String model;
//		public ElectronicsProducts(String brand, String warrenty, String model) {
//			//super();
//			this.brand = brand;
//			this.warrenty = warrenty;
//			this.model = model;
//		}
		
		public ElectronicsProducts(float price,String category,String name,String origin,String brand, String warrenty, String model) {
			super(price,category,name,origin);
			this.brand = brand;
			this.warrenty = warrenty;
			this.model = model;
		}
		
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getWarrenty() {
			return warrenty;
		}
		public void setWarrenty(String warrenty) {
			this.warrenty = warrenty;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		
}
