package com.example.guiproject.Models;

import com.example.guiproject.DAO.MemberDAO;

import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

public class library {
    private ArrayList<member> members;
    private Time openingHour;
    private Time closingHour;

    public library(ArrayList<member> members, Time openingHour, Time closingHour) {
        this.members = members;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
    }

    public Time getOpeningHour() {
        return openingHour;
    }

    public void setOpeningHour(Time openingHour) {
        this.openingHour = openingHour;
        notifyMembers();
    }

    public Time getClosingHour() {
        return closingHour;
    }

    public void setClosingHour(Time closingHour) {
        this.closingHour = closingHour;
        notifyMembers();
    }

    public void addMember(member m) throws SQLException {
        members.add(m);
        MemberDAO dao = new MemberDAO();
        dao.addMember(m);
    }

    public void removeMember(member m) throws SQLException {
        members.remove(m);
        MemberDAO dao = new MemberDAO();
        dao.removeMember(m);
    }
    public void notifyMembers(){
        String s= "The new working hours are from: "+openingHour+ " till: "+ closingHour;
        for(member m : members){
            m.sendMessage(s);
        }

    }
    public void sendMessage(String s) {
        for (member m : members) {
            m.sendMessage(s);
        }
    }

}
