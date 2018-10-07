package model;

public class Regular implements RentalCalc {
	
	@Override 
	public double getCharge(int daysRented) {
		double thisAmount = 0;
		if (daysRented > 3) {
			thisAmount += (daysRented - 3) * 1.0 + 9;
		} else {
			return daysRented * 3;
		}
		return thisAmount;
	}
	
	@Override 
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}