package in.mywork.oop.inheritance.Assignment;

public class MobileProducts extends ElectronicsProducts{
		boolean isSmartPhone;
		String chargingPort;
		boolean isHeadphoneJac;
		String operatingsystem;
		
		public MobileProducts(float price, String category, String name, String origin, String brand, String warrenty,
				String model, boolean isSmartPhone, String chargingPort, boolean isHeadphoneJac,
				String operatingsystem) {
			super(price, category, name, origin, brand, warrenty, model);
			this.isSmartPhone = isSmartPhone;
			this.chargingPort = chargingPort;
			this.isHeadphoneJac = isHeadphoneJac;
			this.operatingsystem = operatingsystem;
		}

		public boolean isSmartPhone() {
			return isSmartPhone;
		}

		public void setSmartPhone(boolean isSmartPhone) {
			this.isSmartPhone = isSmartPhone;
		}

		public String getChargingPort() {
			return chargingPort;
		}

		public void setChargingPort(String chargingPort) {
			this.chargingPort = chargingPort;
		}

		public boolean isHeadphoneJac() {
			return isHeadphoneJac;
		}

		public void setHeadphoneJac(boolean isHeadphoneJac) {
			this.isHeadphoneJac = isHeadphoneJac;
		}

		public String getOperatingsystem() {
			return operatingsystem;
		}

		public void setOperatingsystem(String operatingsystem) {
			this.operatingsystem = operatingsystem;
		}
		
		
		
		
		
		
		
}
