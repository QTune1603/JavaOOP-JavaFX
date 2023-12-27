package myjavafx3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import java.util.Arrays;

public class ListViewDemo extends Application {
    // Declare an array of Strings for flag titles

    private String[] flagTitles = {"Canada", "Vietnam", "Denmark", "France", "Germany", "India", "Norway", "United Kingdom", "United States of America"};
    private ImageView[] flagImages = {
        new ImageView("https://upload.wikimedia.org/wikipedia/commons/d/d9/Flag_of_Canada_%28Pantone%29.svgfla"),
        new ImageView("https://en.wikipedia.org/wiki/Flag_of_Vietnam#/media/File:Flag_of_Vietnam.svg"),
        new ImageView("https://en.wikipedia.org/wiki/Flag_of_Denmark#/media/File:Flag_of_Denmark.svg"),
        new ImageView("https://upload.wikimedia.org/wikipedia/en/c/c3/Flag_of_France.svg"),
        new ImageView("https://upload.wikimedia.org/wikipedia/en/b/ba/Flag_of_Germany.svg"),
        new ImageView("https://upload.wikimedia.org/wikipedia/en/4/41/Flag_of_India.svg"),
        new ImageView("https://en.wikipedia.org/wiki/Flag_of_Norway#/media/File:Flag_of_Norway.svg"),
        new ImageView("https://upload.wikimedia.org/wikipedia/commons/a/a5/Flag_of_the_United_Kingdom_%281-2%29.svg"),
        new ImageView("https://en.wikipedia.org/wiki/File:Flag_of_the_United_States.svg")
    };

    @Override
    public void start(Stage primaryStage) {
        // Create a ListView with flag titles
        ListView<String> listView = new ListView<>(FXCollections.observableArrayList(flagTitles));
        listView.setPrefSize(100, 400);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        // Create a pane to hold image views
        FlowPane imagePane = new FlowPane(200, 250);
        BorderPane pane = new BorderPane();
        pane.setLeft(new ScrollPane(listView));
        pane.setCenter(imagePane);
        
        listView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    imagePane.getChildren().clear();
                    for (String selectedFlag : listView.getSelectionModel().getSelectedItems()) {
                        int selectedIndex = listView.getItems().indexOf(selectedFlag);
                        imageViews[selectedIndex].setFitWidth(250);
                        imageViews[selectedIndex].setFitHeight(200);
                        imagePane.getChildren().add(imageViews[selectedIndex]);
                    }
                }
        );
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 600, 300);
        primaryStage.setTitle("ListViewDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage 
    }

    public static void main(String[] args) {
        launch(args);
    }
}
