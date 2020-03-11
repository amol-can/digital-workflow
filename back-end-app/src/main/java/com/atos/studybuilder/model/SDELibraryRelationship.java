package com.atos.studybuilder.model;

import javax.persistence.*;

@Entity
public class SDELibraryRelationship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int libraryRelationshipId;

    private String elementType;
    private int elementTypeId; // optional for foreign key
    private boolean relatesTo;
    private String elementType2;
    private int elementType2Id; // optional for foreign key
    private boolean mandatory;

    public SDELibraryRelationship() {
    }

    public SDELibraryRelationship(String elementType, int elementTypeId, boolean relatesTo,
                                  String elementType2, int elementType2Id, boolean mandatory) {
        this.elementType = elementType;
        this.elementTypeId = elementTypeId;
        this.relatesTo = relatesTo;
        this.elementType2 = elementType2;
        this.elementType2Id = elementType2Id;
        this.mandatory = mandatory;
    }

    // getters

    public int getLibraryRelationshipId() {
        return libraryRelationshipId;
    }

    public String getElementType() {
        return elementType;
    }

    public int getElementTypeId() {
        return elementTypeId;
    }

    public boolean isRelatesTo() {
        return relatesTo;
    }

    public String getElementType2() {
        return elementType2;
    }

    public int getElementType2Id() {
        return elementType2Id;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    //setters

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public void setElementTypeId(int elementTypeId) {
        this.elementTypeId = elementTypeId;
    }

    public void setRelatesTo(boolean relatesTo) {
        this.relatesTo = relatesTo;
    }

    public void setElementType2(String elementType2) {
        this.elementType2 = elementType2;
    }

    public void setElementType2Id(int elementType2Id) {
        this.elementType2Id = elementType2Id;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    // toString

    @Override
    public String toString() {
        return "SDELibraryRelationship{" +
                "libraryRelationshipId='" + libraryRelationshipId + '\'' +
                ", elementType='" + elementType + '\'' +
                ", elementTypeId=" + elementTypeId +
                ", relatesTo=" + relatesTo +
                ", elementType2='" + elementType2 + '\'' +
                ", elementType2Id=" + elementType2Id +
                ", mandatory=" + mandatory +
                '}';
    }
}
