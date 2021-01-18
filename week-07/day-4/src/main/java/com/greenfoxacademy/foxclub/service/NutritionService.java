package com.greenfoxacademy.foxclub.service;

import com.greenfoxacademy.foxclub.model.Drink;
import com.greenfoxacademy.foxclub.model.Food;
import com.greenfoxacademy.foxclub.model.Fox;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NutritionService implements FoxServiceInterface {

    @Override
    public List<Fox> getFoxList() {
        return null;
    }

    @Override
    public void setFox(String name) {

    }

    @Override
    public Fox getFox(String name) {
        return null;
    }

    @Override
    public List<String> getTrickList() {
        return null;
    }

    @Override
    public List<String> getFoodList() {
        return Arrays.stream(Food.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getDrinkList() {
        return Arrays.stream(Drink.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }
}
