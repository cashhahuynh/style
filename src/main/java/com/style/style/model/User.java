package com.style.style.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class User extends AbstractEntity {

    @NotNull
    private String username;

    @NotNull
    private String pwHash;

    @OneToOne
    @JoinColumn(name = "SURVEY_ID")
    private Survey survey;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User() {}

    public User(String username, String password) {
        super();
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    public String getUsername() {
        return username;
    }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }
}
