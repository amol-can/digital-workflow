package com.atos.studybuilder.model;

public class StudyLevelContent {


    private int id;
    private String protocolName;
    private String studyPhase;

    public StudyLevelContent(){

    }

    public StudyLevelContent(int id, String protocolName, String studyPhase) {
        this.id = id;
        this.protocolName = protocolName;
        this.studyPhase = studyPhase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    public String getStudyPhase() {
        return studyPhase;
    }

    public void setStudyPhase(String studyPhase) {
        this.studyPhase = studyPhase;
    }

    @Override
    public String toString() {
        return "StudyLevelContent{" +
                "id=" + id +
                ", protocolName='" + protocolName + '\'' +
                ", studyPhase='" + studyPhase + '\'' +
                '}';
    }
}
