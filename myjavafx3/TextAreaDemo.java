package myjavafx3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

public class TextAreaDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        DescriptionPane descriptionPane = new DescriptionPane();

        descriptionPane.setTitle(
                "Canada");
        String description = "The Canadian national flag ...";

        descriptionPane.setImageView(
                new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/300px-Flag_of_Canada_%28Pantone%29.svg.png"));
        descriptionPane.setDescription(description);
        // Create a scene and place it in the stage
        Scene scene = new Scene(descriptionPane, 600, 250);

        primaryStage.setTitle("TextAreaDemo"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    }

    public static void main(String[] args) {
        launch(args);
    }
}
