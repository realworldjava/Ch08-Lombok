package com.wiley.realworldjava.lombok.example09;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Automobile {
    // Generate a protected setter for manufacturer
    // generates method: protected setManufacturer(String m)
    @Setter(AccessLevel.PROTECTED) private String manufacturer;

    // The class @Setter and @Getter annotations will generate
    // appropriate getter and setter for “make”
    private String make;

    // Don’t generate a setter for variable “model”
    @Setter(AccessLevel.NONE) private String model;
}



