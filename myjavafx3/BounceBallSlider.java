package myjavafx3;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

public class BounceBallSlider extends Application {

    @Override
    public void start(Stage primaryStage) {
        BallPane ballPane = new BallPane(); // Create a custom BallPane for the bouncing ball
        Slider slSpeed = new Slider(); // Create a Slider for controlling the animation speed
        slSpeed.setMax(100); // Set the maximum value for the slider // Bind the animation rate property of the BallPane to the value property of the Slider
        ballPane.rateProperty().bind(slSpeed.valueProperty());
        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane); // Place the BallPane in the center of the BorderPane
        pane.setBottom(slSpeed); // Place the Slider at the bottom of the BorderPane
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("BounceBallSlider"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class BallPane extends Pane {

    public final double radius = 20;
    private double x = radius, y = radius;
    private double dx = 1, dy = 1;
    private Circle circle = new Circle(x, y, radius);
    private Timeline animation;

    public BallPane() {
        circle.setFill(Color.GREEN); // Set ball color
        getChildren().add(circle);
        animation = new Timeline(
                new KeyFrame(Duration.millis(50), e -> moveBall()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play(); // Start animation
    }

    public void play() {
        animation.play();
    }

    public void pause() {
        animation.pause();
    }

    public void increaseSpeed() {
        animation.setRate(animation.getRate() + 0.1);
    }

    public void decreaseSpeed() {
        animation.setRate(
                animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
    }

    public DoubleProperty rateProperty() {
        return animation.rateProperty();
    }

    protected void moveBall() {
        // Check boundaries
        if (x < radius || x > getWidth() - radius) {
            dx *= -1; // Change ball move direction
        }
        if (y < radius || y > getHeight() - radius) {
            dy *= -1; // Change ball move direction
        }
        // Adjust ball position
        x += dx;
        y += dy;
        circle.setCenterX(x);
        circle.setCenterY(y);
    }
}
