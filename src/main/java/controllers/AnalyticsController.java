package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class AnalyticsController {


    public Button btnHome;
    public Button btnAnalytics;
    public Button btnSettings;
    public Button btnChannelInfo;
    public Button btnCompareChannelInfo;
    public Button btnSortingChannel;
    public Button btnMediaResonance;
    public Button btnCompareMediaResonance;
    public Button btnSortingMediaResonance;

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

    public void channelInfo(ActionEvent event) {
        try {
            MainApp.window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/fxml/infoChannel.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void compareChannelInfo(ActionEvent event) {
        try {
            MainApp.window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/fxml/compareChannelInfo.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sortingChannel(ActionEvent event) {
    }

    public void mediaResonance(ActionEvent event) {
    }

    public void compareMediaResonance(ActionEvent event) {
    }

    public void sortingMediaResonance(ActionEvent event) {
    }
}
