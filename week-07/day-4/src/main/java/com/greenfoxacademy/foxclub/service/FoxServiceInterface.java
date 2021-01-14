package com.greenfoxacademy.foxclub.service;

import com.greenfoxacademy.foxclub.model.Fox;

import java.util.List;

public interface FoxServiceInterface {
    List<Fox> getFoxList();
    void setFox(String name);
    public Fox getFox(String name);
}
