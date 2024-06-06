// MainApp.java
package pbo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class pbo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root = loader.load();

        // Set the stage title and scene
        primaryStage.setTitle("Login App");
        primaryStage.setScene(new Scene(root, 800, 500));

        // Get the controller from the FXMLLoader
        LoginController loginController = loader.getController();

        // Initialize any components or data in the controller (optional)
        loginController.initialize();

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
