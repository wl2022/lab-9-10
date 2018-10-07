package model;

import model.LineItem;

public class DiscountedBundle implements LineItem{
	private LineItem rentals;
	
	public DiscountedBundle(LineItem rentals) {
		this.rentals = rentals;
	}
	
	public double getCharge() {
		return rentals.getCharge()* 0.9;
	}
}
