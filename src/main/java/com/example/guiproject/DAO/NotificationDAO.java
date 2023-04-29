package com.example.guiproject.DAO;

import com.example.guiproject.Models.Notification;

import java.sql.*;

public class NotificationDAO {
    Connection conn;
    public void addNotification(Notification notification,int id) throws SQLException {

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        String query = "INSERT INTO Notifications (libId,title,body,read) VALUES (?,?,?,?);";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.setString(2, notification.getTitle());
            statement.setString(2, notification.getBody());
            statement.setBoolean(2, false);
            statement.executeQuery();
        }
    }
}
