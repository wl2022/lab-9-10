package model;

public class New implements RentalCalc {
	
	@Override 
	public double getCharge(int daysRented) {
		 return daysRented * 5;
	}
	
	@Override 
	public int getFrequentRenterPoints(int daysRented) {
		if (daysRented > 1)
			return 2;
		else 
			return 1;	
		
	}
}

