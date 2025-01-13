package in.mywork.finaldemo;

public class Holidays {
	final String festival;
	final int noOfLeaves;
	
	public Holidays(String festival,int noOfLeaves) {
		this.festival = festival;
		this.noOfLeaves = noOfLeaves;
	}

	public final String getFestival() {
		return festival;
	}

	public final int getNoOfLeaves() {
		return noOfLeaves;
	}
	
	@Override
	public String toString() {
		return "Festival :" +festival+", No. of Holydays  "+ noOfLeaves;
	}
}
