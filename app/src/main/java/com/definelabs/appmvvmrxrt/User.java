package com.definelabs.appmvvmrxrt;

import android.graphics.Picture;

public class User {
    public Picture img;
    private String userName;
    private String phoneNumber;
    private String emailId;

    public User() {
    }

    public Picture getImg() {
        return img;
    }

    public void setImg(Picture img) {
        this.img = img;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
