package com.example.guiproject.controllers;

import com.example.guiproject.DAO.RentedBookDAO;
import com.example.guiproject.Models.RentedBook;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date; // or import java.sql.Date;
import java.util.ResourceBundle;

public class homeController implements Initializable {

    @FXML
    public TableView rentedBooksTable;
    @FXML
    public TableColumn<RentedBook,Integer> rentedBookColumn;
    @FXML
    public TableColumn<RentedBook,Integer> rentedMemberColumn;
    @FXML
    public TableColumn<RentedBook, Date> rentedDateColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            RentedBookDAO rentedBookDAO = new RentedBookDAO();
            ObservableList<RentedBook> rentedBooks = (ObservableList<RentedBook>) rentedBookDAO.getAllRentedBooks();
            //casting may cause some errors
            // pay attention to this
            rentedBooksTable.setItems(rentedBooks);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
