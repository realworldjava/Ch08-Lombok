package com.wiley.realworldjava.lombok.example10;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor @ToString
public class User {
    private final int userID;
    private String name;
    @ToString.Exclude private String address;

    public static void main(String[] args) {
        User user = new User(123, "Joe", "123 Main");
        System.out.println(user);
    }
}
