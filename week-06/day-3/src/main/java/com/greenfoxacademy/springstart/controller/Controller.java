package com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/hello")

    @ResponseBody
    public String hello() {
        return "Hello World!";
    }



}
