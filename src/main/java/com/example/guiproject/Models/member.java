package com.example.guiproject.Models;

public class member {

    private int id;
    private String phoneNumber;
    private String email;
    private String name;

    public member(int id, String phoneNumber, String email, String name) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.name = name;
    }

    public member(String phoneNumber, String email, String name) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getNotified(String s){

    }

    public void sendMessage(String s){
        // the code that needs to be fixed
    }
}
