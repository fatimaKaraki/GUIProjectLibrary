package com.example.guiproject.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class loginController {

    @FXML
    private Button login;
    @FXML
    private Button clear;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void login(ActionEvent event) throws IOException {
        String name = username.getText();
        String pass = password.getText();


    }

    public void clear(){

    }
}
