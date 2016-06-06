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

    //add listener to pause and play the clock
		EventHandler<ActionEvent> eventHandler = e -> {
			pane.setCurrentTime();
			pane.paintClock();
		};

    //use timeline in java FX
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000.00), eventHandler));

    // Start animation
    animation.setCycleCount(Timeline.INDEFINITE);

    //create two buttons to stop and start the clock
		Button btStop = new Button("Stop");
		btStop.setOnAction(e -> {
			animation.pause();
		});
		Button btStart = new Button("Start");
		btStart.setOnAction(e -> {
			animation.play();

		});

    //set the second pane to show buttons
		btStop.setPrefSize(100, 100);
		btStart.setPrefSize(100, 100);
		pane2.add(btStop,1,2);
		pane2.add(btStart,2,2);
		stage.setTitle("Control");
		Scene scene2 = new Scene(pane2,200,100);
		stage.setScene(scene2);
		stage.show();
	}

  //Main method
	public static void main(String[] args) {
		launch(args);
	}
}
