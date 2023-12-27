package myjavafx3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class ComboBoxDemo extends Application {

    private String[] flagTitles = {"Canada", "Vietnam", "Denmark", "France",
        "Germany", "India", "Norway", "United Kingdom", "United States of America"};
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
    private String[] flagDescriptions = {
        "The Canadian national flag ... ",
        "Description for China ... ",
        "Description for Denmark ... ",
        "Description for France ... ",
        "Description for Germany ... ",
        "Description for India ... ",
        "Description for Norway ... ",
        "Description for UK ... ",
        "Description for US ... "
    };
    private DescriptionPane descriptionPane = new DescriptionPane();
    private ComboBox<String> cbo = new ComboBox<>();

    @Override
    public void start(Stage primaryStage) {
        initializeFlagDescriptions();
        setDisplay(0);
        BorderPane pane = new BorderPane();
        BorderPane paneForComboBox = new BorderPane();
        paneForComboBox.setLeft(new Label("Select a country: "));
        paneForComboBox.setCenter(cbo);
        pane.setTop(paneForComboBox);
        cbo.setPrefWidth(400);
        cbo.setValue("Canada");
        ObservableList<String> items
                = FXCollections.observableArrayList(flagTitles);
        cbo.getItems().addAll(items);
        pane.setCenter(descriptionPane);
        cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));
        Scene scene = new Scene(pane, 600, 300);
        primaryStage.setTitle("ComboBoxDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void initializeFlagDescriptions() {
        for (int i = 0; i < flagDescriptions.length; i++) {
            flagDescriptions[i] = "Description for " + flagTitles[i] + " ...";
        }
    }

    public void setDisplay(int index) {
        descriptionPane.setTitle(flagTitles[index]);
        descriptionPane.setImageView(flagImages[index]);
        descriptionPane.setDescription(flagDescriptions[index]);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
