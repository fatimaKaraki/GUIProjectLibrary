package com.example.guiproject.controllers;

import com.example.guiproject.DAO.BookDAO;
import com.example.guiproject.DAO.MemberDAO;
import com.example.guiproject.DAO.RentedBookDAO;
import com.example.guiproject.Models.RentedBook;
import com.example.guiproject.Models.book;
import com.example.guiproject.Models.member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.w3c.dom.events.Event;

import java.sql.SQLException;
import java.time.LocalDate;

import static java.lang.Integer.parseInt;

public class RentBookController {

    @FXML
    public TextField bookId;
    @FXML
    public TextField memberId;
    @FXML
    public Label warning;
    @FXML
    public Button rentButton1;

    @FXML
    public void rentButton(ActionEvent actionEvent) throws SQLException {
        BookDAO bdao = new BookDAO();
        MemberDAO mdao = new MemberDAO();
        RentedBookDAO rdao = new RentedBookDAO();
        book b = bdao.getBookById( parseInt(bookId.getText()));
        member m =  mdao.getMemberById(parseInt(memberId.getText()));
        if(b !=null && m !=null  && b.getStatus()==0 ){

            LocalDate today = LocalDate.now(); // get the current date
            LocalDate twoWeeksLater = today.plusWeeks(2);
            java.sql.Date sqlDate = java.sql.Date.valueOf(twoWeeksLater);
            RentedBook rb = new RentedBook(b.getId(),m.getId(),sqlDate);
            rdao.addRentedBook(rb);

        }
    }

}
