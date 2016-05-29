package view;

/**
 * Created by wookie on 5/29/16.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class View extends Application {
    public Button button1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
