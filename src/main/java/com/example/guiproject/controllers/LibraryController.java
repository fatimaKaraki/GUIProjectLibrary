package com.example.guiproject.controllers;

import com.example.guiproject.HelloApplication;
import com.example.guiproject.Models.Manager;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LibraryController implements Initializable {
    public AnchorPane container;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(HelloApplication.user instanceof Manager) {


            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../com.example./addNotification.fxml"));
            try {
                Parent content = loader.load();
                container.getChildren().setAll(content);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
