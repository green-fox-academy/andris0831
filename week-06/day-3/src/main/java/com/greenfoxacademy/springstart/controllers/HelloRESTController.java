package com.greenfoxacademy.springstart.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong atomicLong = new AtomicLong();



    @RequestMapping(value = "/greeting")

    public Greeting greeting(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        return new Greeting(atomicLong.getAndIncrement(), "Hello " + name);
    }
}
