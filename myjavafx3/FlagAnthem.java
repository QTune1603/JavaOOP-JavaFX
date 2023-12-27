package myjavafx3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class FlagAnthem extends Application {

    private final static int NUMBER_OF_NATIONS = 2;
    private int currentIndex = 0;
    private String[] flagTitles = {"canada", "vietnam"};

    @Override
    public void start(Stage primaryStage) {
        Image[] images = new Image[NUMBER_OF_NATIONS];
        MediaPlayer[] mp = new MediaPlayer[NUMBER_OF_NATIONS];
        // Load images and audio for each nation
        for (int i = 0; i < NUMBER_OF_NATIONS; i++) {
            images[i] = new Image("D:\\study d\\2023-2024 Semester1\\JAVA\\Java Core\\Chapter15\\image\\" + flagTitles[i] + ".png");
            mp[i] = new MediaPlayer(new Media(new File("D:\\study d\\2023-2024Semester 1\\JAVA\\Java Core\\Chapter15\\anthem\\" + flagTitles[i] + ".mp3").toURI().toString()));
        }
        Button btPlayPause = new Button("||");
        btPlayPause.setOnAction(e -> {
            if (btPlayPause.getText().equals(">")) {
                btPlayPause.setText("||");
                mp[currentIndex].play();
            } else {
                btPlayPause.setText(">");
                mp[currentIndex].pause();
            }
        });
        ImageView imageView = new ImageView(images[currentIndex]);
        ComboBox<String> cboNation = new ComboBox<>();
        ObservableList<String> items
                = FXCollections.observableArrayList("Canada", "Vietnam");
        cboNation.getItems().addAll(items);
        cboNation.setValue(items.get(0));
        cboNation.setOnAction(e -> {
            mp[currentIndex].stop();
            currentIndex = items.indexOf(cboNation.getValue());
            imageView.setImage(images[currentIndex]);
            mp[currentIndex].play();
            btPlayPause.setText("||");
        });
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btPlayPause, new Label("Select a nation: "),
                cboNation);
        hBox.setAlignment(Pos.CENTER);
        BorderPane pane = new BorderPane();
        imageView.setFitHeight(200);
        imageView.setFitWidth(300);
        pane.setCenter(imageView);
        pane.setBottom(hBox);
        Scene scene = new Scene(pane, 350, 270);
        primaryStage.setTitle("FlagAnthem");
        primaryStage.setScene(scene);
        primaryStage.show();
        mp[currentIndex].play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
