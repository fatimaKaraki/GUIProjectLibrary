package com.example.guiproject.Models;

import java.sql.SQLException;

public interface Observable {
    public void notifyAllMembers (Notification notification) throws SQLException;
}





