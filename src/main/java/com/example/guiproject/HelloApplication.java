package com.example.guiproject;

import com.example.guiproject.Models.Staff;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    public static Staff user;

    @Override
    public void start(Stage stage1) throws IOException {
//        stage1.setResizable(false);
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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("members.fxml"));
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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("rentBook.fxml"));
        Parent root = loader.load();
        // Get the stage information
        stage.setTitle("Renting A Book");
        stage.getScene().setRoot(root);
    }

    public  void editBook() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("editBook.fxml"));
        Parent root = loader.load();
        // Get the stage information
        stage.setTitle("Editing Books");
        stage.getScene().setRoot(root);
    }





    public static void main(String[] args) {
        launch();
    }
}