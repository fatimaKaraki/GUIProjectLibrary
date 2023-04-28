package com.example.guiproject.DAO;

import com.example.guiproject.Models.Member;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {

    Connection conn;
    public void addMember(Member m) throws SQLException {

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        String query = "INSERT INTO members (name,phoneNumber,email) VALUES (?,?,?);";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            statement.setString(1, m.getName());
            statement.setString(2, m.getPhoneNumber());
            statement.setString(2, m.getEmail());
            statement.executeQuery();
        }
    }

    public void removeMember(Member m) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        String query = "DELETE FROM members WHERE id = ?;";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, m.getId());
            statement.execute();
        }
    }

    public ArrayList<Member> getMembers() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        String query = "SELECT * FROM members;";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Member> Members = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                Member m = new Member(id,phoneNumber,email,name);
                Members.add(m);
            }
            return Members;
        }

    }
    public Member getMemberById(int i) throws SQLException {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
            String query = "SELECT * FROM members WHERE id = ?;";
            try (PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setInt(1, i);
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    String name = resultSet.getString("name");
                    String phoneNumber = resultSet.getString("phoneNumber");
                    String email = resultSet.getString("email");
                    return new Member(i,phoneNumber,email,name);
                } else {
                    return null;
                }
            }
        }

}
