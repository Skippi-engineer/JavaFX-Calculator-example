package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/mainView.fxml"));
        primaryStage.setTitle("Calculator");
        //https://flyclipart.com/calculator-icon-calculator-icon-png-592522#
        //https://creativecommons.org/licenses/by-nc/4.0/deed.pl
        primaryStage.getIcons().add(new Image(getClass().getResource("/img/calculator-icon.png").toExternalForm()));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}