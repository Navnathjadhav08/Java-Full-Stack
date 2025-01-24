package in.mywork.oop.inheritance.Assignment;

public class FoodProduct extends Products {
		boolean isreadytoeat;
		String expirydate;
		boolean isFastFood;
		boolean isNonveg;
		
		public FoodProduct(float price, String category, String name, String origin, boolean isreadytoeat,
				String expirydate, boolean isFastFood, boolean isNonveg) {
			super(price, category, name, origin);
			this.isreadytoeat = isreadytoeat;
			this.expirydate = expirydate;
			this.isFastFood = isFastFood;
			this.isNonveg = isNonveg;
		}

		public boolean isIsreadytoeat() {
			return isreadytoeat;
		}

		public void setIsreadytoeat(boolean isreadytoeat) {
			this.isreadytoeat = isreadytoeat;
		}

		public String getExpirydate() {
			return expirydate;
		}

		public void setExpirydate(String expirydate) {
			this.expirydate = expirydate;
		}

		public boolean isFastFood() {
			return isFastFood;
		}

		public void setFastFood(boolean isFastFood) {
			this.isFastFood = isFastFood;
		}

		public boolean isNonveg() {
			return isNonveg;
		}

		public void setNonveg(boolean isNonveg) {
			this.isNonveg = isNonveg;
		}
		
//		public FoodProduct(boolean isreadytoeat, String expirydate, boolean isFastFood, boolean isNonveg) {
//			super();
//			this.isreadytoeat = isreadytoeat;
//			this.expirydate = expirydate;
//			this.isFastFood = isFastFood;
//			this.isNonveg = isNonveg;
//		}
		
		
		
		
		
		
		
}
