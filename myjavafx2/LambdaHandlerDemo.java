package myjavafx2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class LambdaHandlerDemo extends Application {

    @Override // Override the start method in the Application class

    public void start(Stage primaryStage) {
        Circle circle = new Circle(40);
        circle.setRadius(20);
        circle.setFill(Color.RED);
        Pane pane = new Pane(circle);
        // Hold four buttons in an HBox
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        HBox hBox = new HBox(btUp, btDown, btLeft, btRight);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        BorderPane borderPane = new BorderPane(pane);
        borderPane.setBottom(hBox);

        btUp.setOnAction((ActionEvent e) -> {
            circle.setCenterY(circle.getCenterY() > 10 ? circle.getCenterY() - 5
                    : 10);
        });
        btDown.setOnAction((e) -> {
            circle.setCenterY(circle.getCenterY() < pane.getHeight()
                    ? circle.getCenterY() + 5 : pane.getHeight());
        });
        btLeft.setOnAction(e -> {
            circle.setCenterX(circle.getCenterX() > 0 ? circle.getCenterX() - 5
                    : 0);
        });
        btRight.setOnAction(e -> circle.setCenterX(
                circle.getCenterX() < pane.getWidth() - 100 ? circle.getCenterX()
                + 5 : pane.getWidth() - 100));
// Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 400, 350);
        primaryStage.setTitle("LambdaHandlerDemo"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}
