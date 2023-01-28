package com.style.style.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("wear")
public class WearController {

    //create & read
    @GetMapping("")
    public String toWear() {
        return "wear/index";
    }

}
