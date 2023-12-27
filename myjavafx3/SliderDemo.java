package myjavafx3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class SliderDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(20, 20, "JavaFX Programming");
        // Create a horizontal slider
        Slider slHorizontal = new Slider();
        slHorizontal.setShowTickLabels(true);
        slHorizontal.setShowTickMarks(true);
        // Create a vertical slider
        Slider slVertical = new Slider();
        slVertical.setOrientation(Orientation.VERTICAL);
        slVertical.setShowTickLabels(true);
        slVertical.setShowTickMarks(true);
        slVertical.setValue(50);
        // Create a text in a pane
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        // Create a border pane to hold text and sliders
        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText);
        pane.setBottom(slHorizontal);
        pane.setRight(slVertical);
        // Listener for horizontal slider value change
        slHorizontal.valueProperty().addListener(ov -> {
            text.setX(slHorizontal.getValue() * paneForText.getWidth() / slHorizontal.getMax());
        });
        // Listener for vertical slider value change
        slVertical.valueProperty().addListener(ov -> {
            text.setY((slVertical.getMax() - slVertical.getValue()) * paneForText.getHeight() / slVertical.getMax());
        });
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setTitle("SliderDemo"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}
