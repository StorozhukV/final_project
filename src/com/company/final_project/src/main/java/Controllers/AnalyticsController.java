package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class AnalyticsController {
    @FXML
    private Button btnHome;
    @FXML
    private Button btnAnalytics;
    private Button btnSetting;


    @FXML
    public void moveToHome(ActionEvent event) {
        try {
            MainApp.window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/fxml/home.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void moveToAnalytics(ActionEvent event) {
        try {
            MainApp.window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/fxml/analytics.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void moveToSettings(ActionEvent event) {
        try {
            MainApp.window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/fxml/settings.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
