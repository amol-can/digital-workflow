package com.atos.studybuilder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudyDesignElementValue {

    enum ElementValueState {
        ACTIVATE,INACTIVE,OBSOLETE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int elementValuesId;

    private String studyDesignElement;
    private String value;
    private ElementValueState state;
    private String definition;

    public StudyDesignElementValue(){}

    public StudyDesignElementValue(int elementValuesId, String studyDesignElement, String value,
                                   ElementValueState state, String definition) {
        this.elementValuesId = elementValuesId;
        this.studyDesignElement = studyDesignElement;
        this.value = value;
        this.state = state;
        this.definition = definition;
    }

    // getters
    public int getElementValuesId() {
        return elementValuesId;
    }

    public String getStudyDesignElement() {
        return studyDesignElement;
    }

    public String getValue() {
        return value;
    }

    public ElementValueState getState() {
        return state;
    }

    public String getDefinition() {
        return definition;
    }

    // setters

    public void setStudyDesignElement(String studyDesignElement) {
        this.studyDesignElement = studyDesignElement;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setState(ElementValueState state) {
        this.state = state;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    // toString

    @Override
    public String toString() {
        return "StudyDesignElementValue{" +
                "elementValuesId=" + elementValuesId +
                ", studyDesignElement='" + studyDesignElement + '\'' +
                ", value='" + value + '\'' +
                ", state=" + state +
                ", definition='" + definition + '\'' +
                '}';
    }
}
