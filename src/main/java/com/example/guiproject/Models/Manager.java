package com.example.guiproject.Models;

import com.example.guiproject.DAO.StaffDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class Manager extends Staff implements Observable{
    private ArrayList<Librarian> librarians;
    public Manager(int id, String username, String password) throws SQLException {
        super(id, username, password);
        StaffDAO sdao = new StaffDAO();
        librarians= sdao.getAllLibrarians();

    }

    public void notifyAllMembers (Notification notification) throws SQLException {
        for (Librarian b : librarians) {
            b.getNotified(notification);
        }
    }
}