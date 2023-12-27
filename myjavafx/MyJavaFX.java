package myjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a scene and place a button in the scene

        Button btOK = new Button("Tung");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("MyJavaFX"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

   
    public static void main(String[] args) {
        Application.launch(args);
    }

}
