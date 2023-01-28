package com.style.style.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sell")
public class SellController {

    //delete, can also be archived? will interact with Outfit model
    @GetMapping("")
    public String toSell() {
        return "sell/index";
    }

}
