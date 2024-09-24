package com.alvarto.alvarto_pizzeria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvarto.alvarto_pizzeria.service.ListPizza;

@RestController
@RequestMapping("/api")
public class Pizza {

    @Autowired
    private ListPizza listPizza;

    @GetMapping()
    public void decir(){
        this.listPizza.ListPizza();
    }
}
