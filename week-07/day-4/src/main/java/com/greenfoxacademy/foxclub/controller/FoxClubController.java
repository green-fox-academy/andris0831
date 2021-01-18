package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.service.FoxServiceInterface;
import com.greenfoxacademy.foxclub.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;

@Controller
public class FoxClubController {

    FoxServiceInterface foxServiceInterface;
    Fox fox;

    @Autowired
    public FoxClubController(InformationService foxServiceInterface) {
        this.foxServiceInterface = foxServiceInterface;
    }

    @GetMapping("/")
    public String landing(Model model, @RequestParam(required = false, defaultValue = "Fox") String name) {
        if (name == null) {
            this.fox = foxServiceInterface.getFox(name);
        } else {
            fox = foxServiceInterface.getFox(name);
        }
            model.addAttribute("name", fox.getName());
            model.addAttribute("food", fox.getFood());
            model.addAttribute("drink", fox.getDrink());
            return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {

        return "login";
    }

    @PostMapping("/login")
    public String loginPost(String name, Model model) {
        return "redirect:/?name=" + name;
    }

    @GetMapping("/tricks")
    public String trick(Model model) {
        model.addAttribute("trickList", foxServiceInterface.getTrickList());
        return "tricks";
    }

    @GetMapping("/nutrition-store")
    public String getFood(Model model) {
        model.addAttribute("foodList", foxServiceInterface.getFoodList());
        model.addAttribute("drinkList", foxServiceInterface.getDrinkList());
        return "nutrition-store";
    }


    //@PostMapping
    //public String postTrick(@RequestParam String trick, Model model) {
      //  model.addAttribute("trick", foxServiceInterface.);
    //}

   // @PostMapping("/add-fox")
    //public String addFox(@ModelAttribute Fox fox) {
      //  foxServiceInterface.addFox(fox);
        //return "redirect:/";
    //}
}
