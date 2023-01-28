package com.style.style.model;

import javax.persistence.Entity;

@Entity
public class Outfit extends AbstractEntity {

    //purpose of this model is to grab id's of items and COUNT its desirability: use HashMaps
    //if items have low grab rate, deletion is recommended
    //can we also use to archive?

    //creating members to run program. will need to recreate fields

    private String test;

    public Outfit(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
