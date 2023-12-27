package myjavafx3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ButtonDemo extends Application {

    protected Text text = new Text(50, 50, "JavaFX Battle");

    protected BorderPane getPane() {
        HBox paneForButtons = new HBox(20);
        Button btLeft = new Button("Left",new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Flag_of_the_United_States.svg / 285px - Flag_of_the_United_States.svg.png"));
        Button btRight = new Button("Right",new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Flag_of_North_Vietnam_ % 281955 % E2 % 80 % 931976 % 29.svg / 230pxFlag_of_North_Vietnam_ % 281955 % E2 % 80 % 931976 % 29.svg.png"));
        paneForButtons.getChildren().addAll(btLeft, btRight);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color: green");
        
        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);
        
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);
        
        btLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btRight.setOnAction(e -> text.setX(text.getX() + 10));
        
        return pane;
    }

    @Override 
    public void start(Stage primaryStage) {
        Scene scene = new Scene(getPane(), 450, 200);
        primaryStage.setTitle("ButtonDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
} 

