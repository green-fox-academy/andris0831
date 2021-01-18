package com.greenfoxacademy.foxclub.service;

import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.model.Tricks;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrickService implements FoxServiceInterface {

    private InformationService informationService;

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
        return Arrays.stream(Tricks.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getFoodList() {
        return null;
    }

    @Override
    public List<String> getDrinkList() {
        return null;
    }

}




