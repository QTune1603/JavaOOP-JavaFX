package myjavafx3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.layout.*;
import javafx.scene.text.*;

public class CheckBoxDemo extends ButtonDemo {

    @Override // Override the getPane() method in the super class
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();
        Font fontBoldItalic = Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 20);
        Font fontBold = Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.REGULAR, 20);
        Font fontItalic = Font.font("Times New Roman",
                FontWeight.NORMAL, FontPosture.ITALIC, 20);
        Font fontNormal = Font.font("Times New Roman",
                FontWeight.NORMAL, FontPosture.REGULAR, 20);
        text.setFont(fontNormal);
        VBox paneForCheckBoxes = new VBox(20);
        paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
        paneForCheckBoxes.setStyle("-fx-border-color: green");
        CheckBox chkBold = new CheckBox("Bold");
        CheckBox chkItalic = new CheckBox("Italic");
        paneForCheckBoxes.getChildren().addAll(chkBold, chkItalic);
        pane.setRight(paneForCheckBoxes);
        EventHandler<ActionEvent> handler = e -> {
            if (chkBold.isSelected() && chkItalic.isSelected()) {
                text.setFont(fontBoldItalic); // Both check boxes checked
            } else if (chkBold.isSelected()) {
                text.setFont(fontBold); // The Bold check box checked
            } else if (chkItalic.isSelected()) {
                text.setFont(fontItalic); // The Italic check box checked
            } else {
                text.setFont(fontNormal); // Both check boxes unchecked
            }
        };
        chkBold.setOnAction(handler);
        chkItalic.setOnAction(handler);
        return pane; // Return a new pane
    }

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        super.start(primaryStage);
        primaryStage.setTitle("CheckBoxDemo"); // Set the stage title
    }

    public static void main(String[] args) {
        launch(args);
    }
}
