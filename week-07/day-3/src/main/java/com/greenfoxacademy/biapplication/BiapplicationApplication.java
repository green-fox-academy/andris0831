package com.greenfoxacademy.biapplication;

import com.greenfoxacademy.biapplication.service.BlueColor;
import com.greenfoxacademy.biapplication.service.MyColor;
import com.greenfoxacademy.biapplication.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BiapplicationApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor myColor;



    public static void main(String[] args) {
        SpringApplication.run(BiapplicationApplication.class, args);
    }

    @Autowired
    public BiapplicationApplication(Printer printer, MyColor myColor) {
        this.printer = printer;
        this.myColor = myColor;
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log(myColor.printColor());
    }


}
