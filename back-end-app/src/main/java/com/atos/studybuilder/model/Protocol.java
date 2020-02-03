package com.atos.studybuilder.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Protocol {

    //TODO separate filed for autoincrement
    @Id
    private int id;
    private String title;
    private String shortTitle;
    private String acronym;

    public Protocol(){}

    public Protocol(int id, String title, String shortTitle, String acronym) {
        this.id = id;
        this.title = title;
        this.shortTitle = shortTitle;
        this.acronym = acronym;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    @Override
    public String toString() {
        return "Protocol{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", shortTitle='" + shortTitle + '\'' +
                ", acronym='" + acronym + '\'' +
                '}';
    }
}
