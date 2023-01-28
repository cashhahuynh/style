package com.style.style.model;

import javax.persistence.Entity;

@Entity
public class Survey extends AbstractEntity {

    //list booleans
    private Boolean conflict, organized, inspired, people, undetected, admired, structure, traditions, socialCapital, autoPilot, opinions, help, ambitious, company;

    public Survey() {};

    public Survey(Boolean conflict, Boolean organized, Boolean inspired, Boolean people, Boolean undetected,
                  Boolean admired, Boolean structure, Boolean traditions, Boolean socialCapital, Boolean autoPilot,
                  Boolean opinions, Boolean help, Boolean ambitious, Boolean company) {

        this.conflict = conflict;
        this.organized = organized;
        this.inspired = inspired;
        this.people = people;
        this.undetected = undetected;
        this.admired = admired;
        this.structure = structure;
        this.traditions = traditions;
        this.socialCapital = socialCapital;
        this.autoPilot = autoPilot;
        this.opinions = opinions;
        this.help = help;
        this.ambitious = ambitious;
        this.company = company;

    }

    public Boolean getConflict() {
        return conflict;
    }

    public void setConflict(Boolean conflict) {
        this.conflict = conflict;
    }

    public Boolean getOrganized() {
        return organized;
    }

    public void setOrganized(Boolean organized) {
        this.organized = organized;
    }

    public Boolean getInspired() {
        return inspired;
    }

    public void setInspired(Boolean inspired) {
        this.inspired = inspired;
    }

    public Boolean getPeople() {
        return people;
    }

    public void setPeople(Boolean people) {
        this.people = people;
    }

    public Boolean getUndetected() {
        return undetected;
    }

    public void setUndetected(Boolean undetected) {
        this.undetected = undetected;
    }

    public Boolean getAdmired() {
        return admired;
    }

    public void setAdmired(Boolean admired) {
        this.admired = admired;
    }

    public Boolean getStructure() {
        return structure;
    }

    public void setStructure(Boolean structure) {
        this.structure = structure;
    }

    public Boolean getTraditions() {
        return traditions;
    }

    public void setTraditions(Boolean traditions) {
        this.traditions = traditions;
    }

    public Boolean getSocialCapital() {
        return socialCapital;
    }

    public void setSocialCapital(Boolean socialCapital) {
        this.socialCapital = socialCapital;
    }

    public Boolean getAutoPilot() {
        return autoPilot;
    }

    public void setAutoPilot(Boolean autoPilot) {
        this.autoPilot = autoPilot;
    }

    public Boolean getOpinions() {
        return opinions;
    }

    public void setOpinions(Boolean opinions) {
        this.opinions = opinions;
    }

    public Boolean getHelp() {
        return help;
    }

    public void setHelp(Boolean help) {
        this.help = help;
    }

    public Boolean getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(Boolean ambitious) {
        this.ambitious = ambitious;
    }

    public Boolean getCompany() {
        return company;
    }

    public void setCompany(Boolean company) {
        this.company = company;
    }
}
