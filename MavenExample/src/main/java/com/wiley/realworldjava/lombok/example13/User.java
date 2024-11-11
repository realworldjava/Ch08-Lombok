package com.wiley.realworldjava.lombok.example13;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor @AllArgsConstructor @NoArgsConstructor(force = true)
@ToString
public class User {
    private final int userID;
    private String name;
    private String address;
}
