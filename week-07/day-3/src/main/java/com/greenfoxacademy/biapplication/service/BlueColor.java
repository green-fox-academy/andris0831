package com.greenfoxacademy.biapplication.service;

import org.springframework.stereotype.Service;


public class BlueColor implements MyColor {

    @Override
    public String printColor() {
        return "It is blue color";
    }
}
