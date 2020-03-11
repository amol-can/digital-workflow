package com.atos.studybuilder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SDEValueRelationship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int valueRelationshipId;

    private String elementType;
    private String elementValue;
    // Relationship manage to
    private String elementType2;
    private String elementValue2;
    private boolean relatesTo;
    private String elementType3;
    private String elementValue3;

    public SDEValueRelationship(){}

    public SDEValueRelationship(String elementType, String elementValue, String elementType2, String elementValue2,
                                boolean relatesTo, String elementType3, String elementValue3) {
        this.elementType = elementType;
        this.elementValue = elementValue;
        this.elementType2 = elementType2;
        this.elementValue2 = elementValue2;
        this.relatesTo = relatesTo;
        this.elementType3 = elementType3;
        this.elementValue3 = elementValue3;
    }

    // getters

    public int getValueRelationshipId() {
        return valueRelationshipId;
    }

    public String getElementType() {
        return elementType;
    }

    public String getElementValue() {
        return elementValue;
    }

    public String getElementType2() {
        return elementType2;
    }

    public String getElementValue2() {
        return elementValue2;
    }

    public boolean isRelatesTo() {
        return relatesTo;
    }

    public String getElementType3() {
        return elementType3;
    }

    public String getElementValue3() {
        return elementValue3;
    }

    // setters

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public void setElementValue(String elementValue) {
        this.elementValue = elementValue;
    }

    public void setElementType2(String elementType2) {
        this.elementType2 = elementType2;
    }

    public void setElementValue2(String elementValue2) {
        this.elementValue2 = elementValue2;
    }

    public void setRelatesTo(boolean relatesTo) {
        this.relatesTo = relatesTo;
    }

    public void setElementType3(String elementType3) {
        this.elementType3 = elementType3;
    }

    public void setElementValue3(String elementValue3) {
        this.elementValue3 = elementValue3;
    }

    // toString

    @Override
    public String toString() {
        return "SDEValueRelationship{" +
                "valueRelationshipId=" + valueRelationshipId +
                ", elementType='" + elementType + '\'' +
                ", elementValue='" + elementValue + '\'' +
                ", elementType2='" + elementType2 + '\'' +
                ", elementValue2='" + elementValue2 + '\'' +
                ", relatesTo=" + relatesTo +
                ", elementType3='" + elementType3 + '\'' +
                ", elementValue3='" + elementValue3 + '\'' +
                '}';
    }
}
