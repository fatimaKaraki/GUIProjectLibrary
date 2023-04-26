package com.example.guiproject.controllers;

import com.example.guiproject.HelloApplication;
import javafx.fxml.FXML;

import java.io.IOException;

public class menuController {
    HelloApplication main;

    public menuController() {
        this.main = new HelloApplication();
    }

    @FXML
    public  void  home() throws IOException {
        main.home();
    }

    @FXML
    public void Books() throws IOException {
//        HelloApplication main= new HelloApplication();
        main.Books();
    }

    @FXML
    public void Members() throws IOException {
//        HelloApplication main= new HelloApplication();
        main.members();
    }

    @FXML
    public void library() throws IOException {
        HelloApplication main= new HelloApplication();
        main.library();

    }
}
