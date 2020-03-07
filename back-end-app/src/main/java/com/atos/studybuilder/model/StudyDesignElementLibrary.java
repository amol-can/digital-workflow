package com.atos.studybuilder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudyDesignElementLibrary {

    enum DesignModule{
        Study_Level_Content, Protocol_Level_Content;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int elementId;

    private String studyDesignElement;
    private DesignModule module;
    private String label;
    private String displayOrder;
    private boolean active;
    private String guidanceText;
    private boolean multiplePossible;
    private boolean required;

    public StudyDesignElementLibrary() {
    }

    public StudyDesignElementLibrary(String studyDesignElement, DesignModule module, String label, String displayOrder,
                                     boolean active, String guidanceText, boolean multiplePossible, boolean required) {
        this.studyDesignElement = studyDesignElement;
        this.module = module;
        this.label = label;
        this.displayOrder = displayOrder;
        this.active = active;
        this.guidanceText = guidanceText;
        this.multiplePossible = multiplePossible;
        this.required = required;
    }

    // getters
    public int getElementId() {
        return elementId;
    }

    public String getStudyDesignElement() {
        return studyDesignElement;
    }

    public DesignModule getModule() {
        return module;
    }

    public String getLabel() {
        return label;
    }

    public String getDisplayOrder() {
        return displayOrder;
    }

    public boolean isActive() {
        return active;
    }

    public String getGuidanceText() {
        return guidanceText;
    }

    public boolean isMultiplePossible() {
        return multiplePossible;
    }

    public boolean isRequired() {
        return required;
    }

    // setters

    public void setStudyDesignElement(String studyDesignElement) {
        this.studyDesignElement = studyDesignElement;
    }

    public void setModule(DesignModule module) {
        this.module = module;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setDisplayOrder(String displayOrder) {
        this.displayOrder = displayOrder;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setGuidanceText(String guidanceText) {
        this.guidanceText = guidanceText;
    }

    public void setMultiplePossible(boolean multiplePossible) {
        this.multiplePossible = multiplePossible;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    @Override
    public String toString() {
        return "StudyDesignElementLibrary{" +
                "elementId=" + elementId +
                ", studyDesignElement='" + studyDesignElement + '\'' +
                ", module='" + module + '\'' +
                ", label='" + label + '\'' +
                ", displayOrder='" + displayOrder + '\'' +
                ", active=" + active +
                ", guidanceText='" + guidanceText + '\'' +
                ", multiplePossible=" + multiplePossible +
                ", required=" + required +
                '}';
    }
}
