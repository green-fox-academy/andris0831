package com.greenfoxacademy.biapplication.service;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

    @Override
    public String printColor() {
        return "It is red color";
    }
}
