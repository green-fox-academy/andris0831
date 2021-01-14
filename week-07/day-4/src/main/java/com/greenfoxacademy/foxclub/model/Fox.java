package com.greenfoxacademy.foxclub.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fox {
    private String name;
    private String food = "burgers";
    private String drink = "beer";
    private List<Integer> tricks = new ArrayList<>();

    public Fox(String name) {
        this.name = name;
        this.food = "pizza";
        this.drink = "beer";
    }
}
