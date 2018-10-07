package model;

public class DiscountedRental implements LineItem {
	private LineItem rental;
	
	public DiscountedRental(LineItem r) {
		this.rental = r;
	}
	@Override
	public double getCharge() {
		return rental.getCharge()*0.75;
	}
	
}
