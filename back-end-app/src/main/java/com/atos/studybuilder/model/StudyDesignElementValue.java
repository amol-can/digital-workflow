package com.atos.studybuilder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudyDesignElementValue {

    enum ElementValueState {
        ACTIVE, INACTIVE, OBSOLETE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int elementValuesId;

    private String studyDesignElement;
    private String value;
    private ElementValueState state;
    private String definition;
    private int displayOrder;

    public StudyDesignElementValue() {
    }

    public StudyDesignElementValue(int elementValuesId, String studyDesignElement, String value,
                                   ElementValueState state, String definition, int displayOrder) {
        this.elementValuesId = elementValuesId;
        this.studyDesignElement = studyDesignElement;
        this.value = value;
        this.state = state;
        this.definition = definition;
        this.displayOrder = displayOrder;
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

    public int getDisplayOrder() {
        return displayOrder;
    }

    // setters

    public void setElementValuesId(int elementValuesId) {
        this.elementValuesId = elementValuesId;
    }

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

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
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
                ", displayOrder=" + displayOrder +
                '}';
    }
}
