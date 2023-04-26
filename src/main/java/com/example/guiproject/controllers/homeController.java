package com.example.guiproject.controllers;

import com.example.guiproject.DAO.RentedBookDAO;
import com.example.guiproject.HelloApplication;
import com.example.guiproject.Models.RentedBook;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date; // or import java.sql.Date;
import java.util.ResourceBundle;

public class homeController implements Initializable {

    @FXML
    public TableView <RentedBook> rentedBooksTable ;
    @FXML
    public TableColumn<RentedBook, Integer> rentedBookColumn;
    @FXML
    public TableColumn<RentedBook,Integer> rentedMemberColumn;
    @FXML
    public TableColumn<RentedBook, Date> rentedDateColumn;
    @FXML
    public Label tests1;
    @FXML
    public TextField returnedBookId;
    @FXML
    public Button returnBookButton;
    @FXML
    public Label returnResult;

    ObservableList<RentedBook> rentedBooks;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        begin();
    }

    public void begin(){
        try {
            RentedBookDAO rentedBookDAO = new RentedBookDAO();
            rentedBooks =  FXCollections.observableArrayList(rentedBookDAO.getAllRentedBooks());
            //casting may cause some errors
            // pay attention to this
            rentedBooksTable.setItems(rentedBooks);
            rentedBookColumn.setCellValueFactory(cellData -> {
                Integer bookId = cellData.getValue().getBookId();
                ObjectProperty <Integer> bookIdProperty = new SimpleObjectProperty<>(bookId);
                return bookIdProperty;
            });
            rentedMemberColumn.setCellValueFactory(cellData -> {
                Integer memberId = cellData.getValue().getMemberId();
                ObjectProperty <Integer> memberIdProperty = new SimpleObjectProperty<>(memberId);
                return memberIdProperty;
            });

            rentedDateColumn.setCellValueFactory(cellData -> {
                Date returnDate = cellData.getValue().getReturnDate();
                ObjectProperty <Date> dateProperty = new SimpleObjectProperty<>(returnDate);
                return dateProperty;
            });
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void returnBookById(ActionEvent event) throws SQLException {
        int BookId=  Integer.parseInt(returnedBookId.getText());
        RentedBookDAO r= new RentedBookDAO();
        RentedBook b= r.getRentedBookById(BookId);
        if ( b!= null){
            r.removeRentedBook(b);
            returnResult.setText("Book returned");
        }else{
            returnResult.setText("No rental found");
        }
        RentedBookDAO rentedBookDAO = new RentedBookDAO();
        rentedBooks =  FXCollections.observableArrayList(rentedBookDAO.getAllRentedBooks());
        begin();
    }



}
