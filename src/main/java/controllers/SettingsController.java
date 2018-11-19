package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import settings.Settings;

import java.io.IOException;

public class SettingsController {
    private String pathToCache = "./fileWithSettings.json";
    private Settings settings = new Settings(true, pathToCache, true);


    public Label lblPathToCache;
    public TextField txtFieldNewPath;

    public Label lblTime;
    public Label lblTimeRequest;
    private boolean answerTime;
    @FXML
    public Button btnSaveCache;
    public Button btnPathToCache;
    public Button btnTimeRequest;

    @FXML
    public Button btnHome;
    public Button btnAnalytics;
    public Button btnSettings;

    @FXML
    public void moveToHome(ActionEvent event) {
        try {
            MainApp.window.setScene(new Scene(FXMLLoader.<Parent>load(getClass().getResource("/fxml/home.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void moveToAnalytics(ActionEvent event) {
        try {
            MainApp.window.setScene(new Scene(FXMLLoader.<Parent>load(getClass().getResource("/fxml/analytics.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void moveToSettings(ActionEvent event) {
        try {
            MainApp.window.setScene(new Scene(FXMLLoader.<Parent>load(getClass().getResource("/fxml/settings.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void moveToSaveCache(ActionEvent event) {
        try {
            MainApp.window.setScene(new Scene(FXMLLoader.<Parent>load(getClass().getResource("/fxml/saveCache.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void moveToPathCache(ActionEvent event) {
        try {
            MainApp.window.setScene(new Scene(FXMLLoader.<Parent>load(getClass().getResource("/fxml/pathToCache.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void moveToTimeRequest(ActionEvent event) {
        try {
            MainApp.window.setScene(new Scene(FXMLLoader.<Parent>load(getClass().getResource("/fxml/timeRequest.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean getAnswer() {
        return answerTime;
    }

    public void setTrue(ActionEvent event) {
        this.answerTime = true;
        if (answerTime){
            lblTime.setVisible(true);
            lblTimeRequest.setVisible(true);
            lblTimeRequest.setText(settings.timeRequest());
        }
    }

    public void setFalse(ActionEvent event) {
        this.answerTime = false;
        if (!answerTime){
            lblTime.setVisible(false);
            lblTimeRequest.setVisible(false);
        }

    }

    public void loadPath(MouseEvent mouseEvent) {
        lblPathToCache.setText(settings.getPathToCash());
        pathToCache = txtFieldNewPath.getText();
    }
}
