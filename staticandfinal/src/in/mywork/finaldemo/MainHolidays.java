package in.mywork.finaldemo;

public class MainHolidays  {
		public static void main(String[] args) {
			Holidays diwali = new Holidays("Diwali", 15);
			
			Holidays dasara = new Holidays("Dasara",1);
			
			System.out.println(diwali);
			System.out.println(dasara);//by default called to string method
			//exact same
			System.out.println(diwali.toString());//explicitly call toString()
			System.out.println(dasara.toString());
		}
}
