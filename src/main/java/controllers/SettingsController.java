package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import settings.AllSettings;
import settings.Settings;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SettingsController implements Initializable {

    String pathToCache;
    AllSettings allSettings = new AllSettings();
    @FXML
    public Button btnHome;
    public TextField txtCache;
    public TextField txtPathToCache;
    public TextField txtRequestTime;
    public Button btnSave;
    public Label lblPathToCache;
    @FXML

    public void moveToHome(ActionEvent event) {
        try {
            MainApp.window.setScene(new Scene(FXMLLoader.<Parent>load(getClass().getResource("/fxml/home.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(ActionEvent event) {
        Settings settings = new Settings();
        settings.saveSettingsToFile(AllSettings.serializeObject(new AllSettings(Boolean.parseBoolean(txtCache.getText()),
                txtPathToCache.getText(), Boolean.parseBoolean(txtRequestTime.getText()))));

        if (allSettings.isTime()) {settings.timeRequest();}
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Settings.setSettingsFromFile();
        txtCache.setText(Boolean.toString(allSettings.isSaveCash()));
        lblPathToCache.setText(allSettings.getPathToCash());
        txtPathToCache.setText(allSettings.getPathToCash());
        txtRequestTime.setText(Boolean.toString(allSettings.isTime()));
    }
}
