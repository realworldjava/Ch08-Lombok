package com.wiley.realworldjava.lombok.example02;

import java.util.Objects;
public class User {
    private final int userID;
    private String name;
    private String address;

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(int userID, String name, String address) {
        this.userID = userID;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(o==null) return false;
        return o instanceof User user
                && getUserID()==user.getUserID()
                && Objects.equals(getName(), user.getName())
                && Objects.equals(getAddress(), user.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID(), getName(), getAddress());
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
