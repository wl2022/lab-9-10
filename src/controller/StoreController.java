package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.*;

public class StoreController extends Controller {
	
	@FXML
	private Label movie1;
	@FXML
	private Label movie2;
	@FXML
	private Label movie3;
	@FXML
	private Label movie4;
	@FXML
	private Label movie5;
	
	@FXML
	private Button addm1;
	@FXML
	private Button addm2;
	@FXML
	private Button addm3;
	@FXML
	private Button addm4;
	@FXML
	private Button addm5;
	
	@FXML
	private Label totalprice;
	@FXML 
	private Label basketlist;
	
	Movie m1 = new Movie("new Avengers", new New());
	Movie m2 = new Movie("Potatos", new Regular());
	Movie m3 = new Movie("Hamlet", new Classic());
	Movie m4 = new Movie("Mcbeth", new Classic());
	Movie m5 = new Movie("Deadpool", new New());
	RentalBundle basket = new RentalBundle();
	
	
	private static final int numMovies = 5;
	
	public StoreController(Stage s) {
		super(s);
		System.out.println("storecontroller made");
	}
	
	public void intialise() {
		movie1.setText("potato");
		movie1.setFont(new Font("Arial", 20));
		movie2.setText(m2.getTitle());
		movie3.setText(m3.getTitle());
		movie4.setText(m4.getTitle());
		movie5.setText(m5.getTitle());
		basketlist.setText("empty");
		totalprice.setText("");
	}
	
	@FXML
	public void addSelected(ActionEvent ae) {
		if (addm1.isPressed()) {
			basket.add(new Rental(m1, 4));
		} else if (addm2.isPressed()) {
			basket.add(new Rental(m2, 4));
		} else if (addm3.isPressed()) {
			basket.add(new Rental(m3, 4));
		} else if (addm4.isPressed()) {
			basket.add(new Rental(m4, 4));
		} else if (addm5.isPressed()) {
			basket.add(new Rental(m5, 4));
		}
		totalprice.setText("" + basket.getCharge());
	}

}
