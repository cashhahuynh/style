package com.style.style.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("buy")
public class BuyController {

    //update
    @GetMapping("")
    public String toBuy() {
        return "buy/index";
    }

}
