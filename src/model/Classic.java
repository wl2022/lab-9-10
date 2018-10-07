package model;

public class Classic implements RentalCalc {
	
	@Override 
	public double getCharge(int daysRented) {
		double thisAmount = 0;
		if (daysRented > 5) {
			thisAmount += (daysRented - 5) * 0.5 + 5 * 2.5;
		} else {
			thisAmount = daysRented * 2.5;
		}
		return thisAmount;
	}
	
	@Override 
	public int getFrequentRenterPoints(int daysRented) {
		return 3;
	}
}