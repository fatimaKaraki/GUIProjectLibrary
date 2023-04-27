package com.example.guiproject.DAO;
import com.example.guiproject.Models.book;
import com.example.guiproject.Models.library;
import com.example.guiproject.Models.member;

import java.sql.*;
import java.util.ArrayList;

public class LibraryDAO {
    Connection conn;
    public library getLibrary(int i) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        String query = "SELECT * FROM schedules";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Time opens = resultSet.getTime("opens");
                Time closes = resultSet.getTime("closes");
                MemberDAO memberdao = new MemberDAO();
                ArrayList<member> members = new ArrayList<member>();
                members = memberdao.getMembers();
                library l = new library(members,opens,closes);
                return l;

            } else {
                return null;
            }
        }
    }

    public void updateOpenHour(Time t) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        String query = "UPDATE library SET opens=?;";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setTime(1,t);
            statement.execute();
        }


    }

    public void updateCloseHour(Time t)throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        String query = "UPDATE library SET closes=?;";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setTime(1,t);
            statement.execute();
        }
    }

}
