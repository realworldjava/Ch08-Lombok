package com.wiley.realworldjava.lombok.example11;

import lombok.AllArgsConstructor;
import lombok.ToString;
import java.util.List;

@AllArgsConstructor @ToString
public class User {
    private final int userID;
    private String name;
    @ToString.Exclude private String address;
    private List<String> friends;

    public static void main(String[] args) {
        User user = new User(123, "John Jones", "123 Main",
                List.of("William", "Alok", "Heather"));
        System.out.println(user);
    }
}
