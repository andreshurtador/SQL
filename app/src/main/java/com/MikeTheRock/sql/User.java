package com.MikeTheRock.sql;

/**
 * Created by braya on 18/10/2017.
 */

public class User {
    private String name, email, phone, presta;
    private String uid;

    public User(String name, String email, String phone, String uid, String presta) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.presta = presta;
        this.uid = uid;

    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUid() {
        return uid;
    }


    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPresta() {
        return uid;
    }


    public void setPresta(String uid) {
        this.uid = uid;
    }
}