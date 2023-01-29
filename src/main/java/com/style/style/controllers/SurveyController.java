package com.style.style.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SurveyController {

    @GetMapping("survey")
    public String surveyForm() {
        return "survey";
    }

}
