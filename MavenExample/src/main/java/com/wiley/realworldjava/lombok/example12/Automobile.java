package com.wiley.realworldjava.lombok.example12;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class Automobile {
    private String make;
    private String model;

    @EqualsAndHashCode.Exclude
    private String color;

    public static void main(String[] args) {
        Automobile car1 = new Automobile("Tesla", "Model 3", "Gray");
        Automobile car2 = new Automobile("Tesla", "Model 3", "Red");
        Automobile car3 = new Automobile("Tesla", "Model Y", "Red");

        System.out.println(car1.equals(car2)); // true
        System.out.println(car1.equals(car3)); // false
    }
}


