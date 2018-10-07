package controller;
	
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
        Screen screen = new Screen(primaryStage, "potato", "view/rentalShop.fxml");
        StoreController storeController = new StoreController(primaryStage);
        screen.start(storeController);
	}	
	
	public static void main(String[] args) {
		launch(args);
	}
}
