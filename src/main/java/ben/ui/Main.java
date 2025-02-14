package ben.ui;

import java.io.IOException;

import ben.Ben;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Represents A GUI for Duke using FXML.
 */
public class Main extends Application {

    private Ben ben = new Ben();

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            fxmlLoader.<MainWindow>getController().setBen(ben);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

