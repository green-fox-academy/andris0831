package com.greenfox.simba.controller;

import com.greenfox.simba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {
    private List<BankAccount> bankAccountList = new ArrayList<>();

    public BankAccountController() {
        bankAccountList.add(new BankAccount("Simba" , 2000D, "lion"));
        bankAccountList.add(new BankAccount("Timon", 1000D, "meerkat"));
        bankAccountList.add(new BankAccount("Pumba", 800D, "warthog"));
        bankAccountList.add(new BankAccount("Mufasa", 3000D, "lion"));
        bankAccountList.add(new BankAccount("Rafiki", 1500D, "monkey"));
    }

    @GetMapping("/list")
    public String listOfBankAccounts(Model model) {
        model.addAttribute("bankAccountList", bankAccountList);
        return "list";
    }


    @RequestMapping( path = "/show" , method = RequestMethod.GET)
    public String showAccount(Model model) {
        model.addAttribute("bankAccountList" , bankAccountList);
        return "index";
    }

    @GetMapping("/text")
    public String showAccount2(Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "text";
    }

}
