package com.example.guiproject.controllers;

import com.example.guiproject.DAO.BookDAO;
import com.example.guiproject.HelloApplication;
import com.example.guiproject.Models.Book;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;

public class EditBooksController {

    @FXML
    public TextField bookId;

    @FXML
    public TextField category;

    @FXML
    public TextField name;

    @FXML
    public TextField publisher;
    @FXML
    public Button goBack;
    @FXML
    public Label result;

    @FXML
    public void addBook(ActionEvent event) throws SQLException {
        Book b = new Book(name.getText(),category.getText(),publisher.getText(),0);
        BookDAO bookdao = new BookDAO();
        bookdao.addBook(b);
        result.setText("Book was successfully added");

    }

    @FXML
    public void removeBook(ActionEvent event) throws SQLException {
        BookDAO bookdao = new BookDAO();
        bookdao.removeBook(Integer.parseInt(bookId.getText()));
        result.setText("Book was successfully deleted");
    }

    public void goback(ActionEvent event) throws IOException {
        HelloApplication main= new HelloApplication();
        main.Books();

    }

}

