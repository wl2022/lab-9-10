package model;

import java.util.ArrayList;

public class RentalBundle implements LineItem {
	private ArrayList<LineItem> rentals;
	
	public RentalBundle() {
		this.rentals = new ArrayList<LineItem>();
	}
	
	public int getSize() {
		return rentals.size();
	}
	
	public double getCharge() {
		double total = 0;
		for (LineItem r: rentals) {
			total += r.getCharge();
		}
		return total;
	}
	
	public void add(LineItem r) {
		// TODO Auto-generated method stub
		rentals.add(r);
	}

	public void remove(LineItem r) {
		// TODO Auto-generated method stub
		rentals.remove(r);
	}
}
