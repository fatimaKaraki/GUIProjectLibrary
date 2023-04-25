package com.example.guiproject.Models;

public class Staff {
    public Staff(int id,String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    private int id;
    public String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
