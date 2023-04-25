package com.example.guiproject.DAO;

import com.example.guiproject.Models.Staff;

import java.sql.*;



public class StaffDAO {
    Connection conn;

    public StaffDAO() throws SQLException {
    }

//    public Staff getUserByUsername(String username) throws SQLException {
//        String query = "SELECT * FROM staff WHERE username = ?";
//        PreparedStatement stmt = conn.prepareStatement(query);
//        stmt.setString(1, username);
//        ResultSet rs = stmt.executeQuery();
//        if (rs.next()) {
//            int id = rs.getInt("id");
//            String name = rs.getString("name");
//            String password = rs.getString("password");
//            return new Staff(id, username, password);
//        } else {
//            return null;
//        }
//    }
    public Staff authenticate(String username, String password) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        String query = "SELECT * FROM staff WHERE username = ? AND password = ?";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String staffUsername = resultSet.getString("username");
                String staffPassword = resultSet.getString("password");
                return new Staff(id, staffUsername, staffPassword);
            } else {
                return null;
            }
        }
    }
}
