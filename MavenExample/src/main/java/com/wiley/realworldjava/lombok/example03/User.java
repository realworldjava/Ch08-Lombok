package com.wiley.realworldjava.lombok.example03;

import lombok.Data;
@Data
public class User {
    private final int userID;
    private String name;
    private String address;
}
