package com.greenfoxacademy.foxclub.service;

import com.greenfoxacademy.foxclub.model.Food;
import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.model.Tricks;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class InformationService implements FoxServiceInterface {

    private List<Fox> foxList = new ArrayList<>();
    private Fox fox;


    @Override
    public List<Fox> getFoxList() {
        return foxList;
    }

    @Override
    public void setFox(String name) {
        Optional<Fox> optionalFox = foxList
                .stream().filter(f -> f.getName()
                        .equals("name"))
                .findFirst();
        if (optionalFox.isPresent()) {
            fox = optionalFox.get();
        } else {
            fox = new Fox(name);
            foxList.add(fox);
        }
    }

    @Override
    public Fox getFox(String name) {
        Fox myFox = foxList
                .stream()
                .filter(f -> f.getName().equals(name))
                .findAny()
                .orElse(new Fox(name));
        return myFox;
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
