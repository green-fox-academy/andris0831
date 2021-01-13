package com.greenfoxacademy.biapplication.controller;

import com.greenfoxacademy.biapplication.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BIApplicationController {

    UtilityService utilityService;


    @GetMapping("/useful")
    public String landing() {
        return "index";
    }


    @GetMapping("/useful/colored")
    public String colored(Model model) {
        utilityService = new UtilityService();
        model.addAttribute("selectedColor", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String email(@RequestParam String email, Model model) {
        utilityService = new UtilityService();

        return "email";
    }
}
