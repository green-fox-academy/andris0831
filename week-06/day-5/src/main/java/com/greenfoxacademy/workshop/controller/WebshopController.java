package com.greenfoxacademy.workshop.controller;

import com.greenfoxacademy.workshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebshopController {
     private List<ShopItem> shopItems = new ArrayList<>();

    public WebshopController(){
        shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000D, 5));
        shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000D, 2));
        shopItems.add(new ShopItem("Coca cola", "0.5l standard cola", 25D, 0));
        shopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119D, 100));
        shopItems.add(new ShopItem("T-shirt", "Blue with a corgie on a bike", 300D, 1));
    }
    @GetMapping("/webshop")
    public String landing(Model model){
        model.addAttribute("itemsList", shopItems);
        return "index";
    }


}
