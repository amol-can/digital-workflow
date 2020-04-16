package com.atos.studybuilder.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudyLevelContent {
    @Id
    private String protocolId;
    private String therapeuticArea;
    private String indication;
    private String studyPhase;
    private String studyType;

    public StudyLevelContent(){}

    public StudyLevelContent(String protocolId, String therapeuticArea, String indication, String studyPhase, String studyType) {
        this.protocolId = protocolId;
        this.therapeuticArea = therapeuticArea;
        this.indication = indication;
        this.studyPhase = studyPhase;
        this.studyType = studyType;
    }

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public String getTherapeuticArea() {
        return therapeuticArea;
    }

    public void setTherapeuticArea(String therapeuticArea) {
        this.therapeuticArea = therapeuticArea;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public String getStudyPhase() {
        return studyPhase;
    }

    public void setStudyPhase(String studyPhase) {
        this.studyPhase = studyPhase;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    @Override
    public String toString() {
        return "StudyLevelContent{" +
                ", protocolId='" + protocolId + '\'' +
                ", therapeuticArea='" + therapeuticArea + '\'' +
                ", indication='" + indication + '\'' +
                ", studyPhase='" + studyPhase + '\'' +
                ", studyType='" + studyType + '\'' +
                '}';
    }
}
