//U10416023

//Import Api
import javafx.util.Duration;
import java.util.Timer;
import javafx.event.*;
import javafx.animation.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestClockPane extends Application {

	public void start(Stage primaryStage) {
		//put clockpane into Application
		ClockPane pane = new ClockPane();
		Scene scene = new Scene(pane,600,500);
		primaryStage.setTitle("U10416023­_ClockPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		Stage stage = new Stage();
		GridPane pane2 = new GridPane();
	}

  //Main method
	public static void main(String[] args) {
		launch(args);
	}
}
