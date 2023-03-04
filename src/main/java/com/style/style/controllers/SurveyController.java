package com.style.style.controllers;

import com.style.style.model.Survey;
import com.style.style.model.data.SurveyRepository;
import com.style.style.model.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class SurveyController {

    @Autowired
    SurveyRepository surveyRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("survey")
    public String displaySurveyForm(Model model, Integer userId) {

        model.addAttribute("survey", new Survey());
        return "survey";
    }

    @PostMapping("survey")
    public String processSurveyForm(@ModelAttribute @Valid Survey survey,
                                    Errors errors, Model model) {

        if(errors.hasErrors()) {
            return "survey";
        }

        Survey completedSurvey = new Survey(survey.getConflict(), survey.getOrganized(), survey.getInspired(), survey.getPeople(), survey.getUndetected(),
                survey.getAdmired(), survey.getStructure(), survey.getTraditions(), survey.getSocialCapital(), survey.getAutoPilot(), survey.getOpinions(),
                survey.getHelp(), survey.getAmbitious(), survey.getCompany());
        surveyRepository.save(completedSurvey);

        return "redirect:homepage";
    }

}
