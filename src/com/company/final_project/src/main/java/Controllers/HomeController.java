package Controllers;

import com.sun.scenario.Settings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    private Button btnHome;
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}
