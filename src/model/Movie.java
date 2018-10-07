package model;
/*
 * Moving the getCharge method to the class Movie,
 * Encapsulate Field on the type code to ensure that all uses of the type code go through getting
 * and setting methods. Because most of the code came from other classes, most methods already
 * use the getting method. However, the constructors do access the price code 
 */
public class Movie {

	private String title;
	private int priceCode;
	private RentalCalc calculation;
	
	public Movie(String title, /*int priceCode,*/ RentalCalc strategy) {
		this.title = title;
		//setPriceCode(priceCode);
		this.calculation = strategy;
	}
	
	public int getPriceCode() {
		return priceCode;
	}
	
	public void setPriceCode(int arg) {
		priceCode = arg;
	}
	public String getTitle (){
		return title;
	}

	// Refactor method - refactor getCharge() to class Movie
	double getCharge(int _daysRented) {
		return calculation.getCharge(_daysRented);
	}
	
	int getFrequentRenterPoints(int _daysRented) {
		return calculation.getFrequentRenterPoints(_daysRented);
	}	
}
