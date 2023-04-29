package com.example.guiproject.controllers;

import com.example.guiproject.DAO.MemberDAO;
import com.example.guiproject.Models.Member;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.SQLException;
import java.util.Date;
import java.util.ResourceBundle;

public class MembersController implements Initializable {

    @FXML
    private TextField MemberDeleteInput;

    @FXML
    private TextField MemberEmailInput;

    @FXML
    private TextField MemberPhoneInput;

    @FXML
    private TextField MemberNameInput;

    @FXML
    public TableColumn<Member, String> MemberEmailColumn;

    @FXML
    public TableColumn<Member, Integer> MemberIdColumn;

    @FXML
    public TableColumn<Member, String> MemberNameColumn;

    @FXML
    public TableColumn<Member,String> MemberPhoneColumn;

    @FXML
    public TableView<Member> membersTable;
    ObservableList<Member> members;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        show();
    }

    public void show(){
        try {
            MemberDAO memberDAO = new MemberDAO();
            members =  FXCollections.observableArrayList(memberDAO.getMembers());
            //casting may cause some errors
            // pay attention to this
            membersTable.setItems(members);
            MemberIdColumn.setCellValueFactory(cellData -> {
                Integer memberId = cellData.getValue().getId();
                ObjectProperty<Integer> MemberIdProperty = new SimpleObjectProperty<>(memberId);
                return MemberIdProperty;
            });
            MemberNameColumn.setCellValueFactory(cellData -> {
                String memberName = cellData.getValue().getName();
                ObjectProperty<String> MemberNameProperty = new SimpleObjectProperty<>(memberName);
                return MemberNameProperty;
            });
            MemberPhoneColumn.setCellValueFactory(cellData -> {
                String memberPhone = cellData.getValue().getPhoneNumber();
                ObjectProperty<String> MemberPhoneProperty = new SimpleObjectProperty<>(memberPhone);
                return MemberPhoneProperty;
            });
            MemberEmailColumn.setCellValueFactory(cellData -> {
                String memberEmail = cellData.getValue().getEmail();
                ObjectProperty<String> MemberEmailProperty = new SimpleObjectProperty<>(memberEmail);
                return MemberEmailProperty;
            });
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addMember(ActionEvent event) throws SQLException {
        MemberDAO memberDAO = new MemberDAO();
        String name = MemberNameInput.getText();
        String phone = MemberPhoneInput.getText();
        String email = MemberEmailInput.getText();
        Member m = new Member(phone,email,name);
        memberDAO.addMember(m);
    }

    public void removeMember(ActionEvent event) throws SQLException {
        MemberDAO memberDAO = new MemberDAO();
        int id = Integer.parseInt(MemberDeleteInput.getText());
        memberDAO.removeMember(id);
    }


}
