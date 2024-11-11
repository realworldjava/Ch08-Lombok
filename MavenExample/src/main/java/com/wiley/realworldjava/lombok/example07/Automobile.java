package com.wiley.realworldjava.lombok.example07;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Automobile {
    @Getter @Setter(AccessLevel.PRIVATE) private String model;
}


