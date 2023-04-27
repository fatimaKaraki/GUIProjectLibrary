package com.example.guiproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;

    @Override
    public void start(Stage stage1) throws IOException {
        stage1.setResizable(false);
        this.stage = stage1;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage1.setTitle("Hello!");
        stage1.setScene(scene);
        stage1.show();
    }
    public  void home() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
        Parent root = loader.load();
        stage.setTitle("home");
        stage.getScene().setRoot(root);
    }

    public  void Books() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("books.fxml"));
        Parent root = loader.load();
        stage.setTitle("Books");
        stage.getScene().setRoot(root);
    }
    public  void members() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("memebers.fxml"));
        Parent root = loader.load();
        // Get the stage information
        stage.setTitle("Members");
        stage.getScene().setRoot(root);
    }

    public  void library() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("library.fxml"));
        Parent root = loader.load();
        // Get the stage information
        stage.setTitle("Library");
        stage.getScene().setRoot(root);
    }

    public  void rentBook() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("RentBook.fxml"));
        Parent root = loader.load();
        // Get the stage information
        stage.setTitle("Renting A Book");
        stage.getScene().setRoot(root);
    }





    public static void main(String[] args) {
        launch();
    }
}