// LoginController.java
package pbo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button login_btn;

    @FXML
    private Label minimarket;

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/pbo_minimarket_proyek";
    private static final String DB_USER = "admin";
    private static final String DB_PASSWORD = "admin123";

    @FXML
     void initialize() {
        // You can perform any initialization here
    }

    @FXML
    private void handleLoginAction() {
        String enteredUsername = username.getText();
        String enteredPassword = password.getText();

        if (authenticateUser(enteredUsername, enteredPassword)) {
            // Login successful, redirect to the dashboard or perform any other actions
            minimarket.setText("Welcome to the Dashboard");
        } else {
            // Login failed, display an error message or perform other actions
            minimarket.setText("Invalid username or password");
        }
    }

    private boolean authenticateUser(String enteredUsername, String enteredPassword) {
        try {
            // Establish database connection
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Query to check if the username and password match
            String query = "SELECT * FROM users WHERE username = admin AND password = admin123";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, enteredUsername);
                preparedStatement.setString(2, enteredPassword);

                // Execute the query
                ResultSet resultSet = preparedStatement.executeQuery();

                // If a record is found, login is successful
                return resultSet.next();
            }
        } catch (SQLException e) {
            // Handle any database-related exceptions
            e.printStackTrace();
            return false;
        }
    }
}
