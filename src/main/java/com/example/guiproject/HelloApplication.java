package com.example.guiproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public  void home() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
        Parent root = loader.load();
        Scene homeScene = new Scene(root);
        // Get the stage information
        Stage stage= new Stage();
        stage.setTitle("home");
        stage.setScene(homeScene);
        stage.show();
    }

    public  void Books() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Books.fxml"));
        Parent root = loader.load();
        Scene booksScene = new Scene(root);
        // Get the stage information
        Stage stage= new Stage();
        stage.setTitle("Books");
        stage.setScene(booksScene);
        stage.show();
    }
    public  void members() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("memebers.fxml"));
        Parent root = loader.load();
        Scene membersScene = new Scene(root);
        // Get the stage information
        Stage stage= new Stage();
        stage.setTitle("Members");
        stage.setScene(membersScene);
        stage.show();
    }

    public  void library() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("library.fxml"));
        Parent root = loader.load();
        Scene libraryScene = new Scene(root);
        // Get the stage information
        Stage stage= new Stage();
        stage.setTitle("Library");
        stage.setScene(libraryScene);
        stage.show();
    }





    public static void main(String[] args) {
        launch();
    }
}