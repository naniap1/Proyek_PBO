package pbo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;

public class DashboardController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private AnchorPane topForm;

    @FXML
    private Label welcomeLabel;

    @FXML
    private AnchorPane navForm;

    @FXML
    private Button dashboardBtn;

    @FXML
    private Button logoutBtn;

    @FXML
    private Button produkBtn;

    @FXML
    private Button transaksiBtn;

    @FXML
    private AnchorPane centerForm;

    @FXML
    private AnchorPane card1;

    @FXML
    private Circle circle;

    @FXML
    private FontAwesomeIcon userIcon;

    @FXML
    private Label adminSideLabel;

    @FXML
    private AnchorPane card2;

    @FXML
    private FontAwesomeIcon tagsIcon;

    @FXML
    private Label productLabel;

    @FXML
    private AnchorPane card3;

    @FXML
    private FontAwesomeIcon moneyIcon;

    @FXML
    private Label transaksiLabel;

    public void initialize() {
        // Set initial data or perform any initialization here
        welcomeLabel.setText("Welcome, ADMIN");
    }

    // You can add event handling methods for button clicks or other interactions
    // For example:

    @FXML
    private void handleDashboardButtonClick() {
        // Handle Dashboard button click
    }

    @FXML
    private void handleLogoutButtonClick() {
        // Handle Logout button click
    }

    @FXML
    private void handleProdukButtonClick() {
        // Handle Produk button click
    }

    @FXML
    private void handleTransaksiButtonClick() {
        // Handle Transaksi button click
    }
}
