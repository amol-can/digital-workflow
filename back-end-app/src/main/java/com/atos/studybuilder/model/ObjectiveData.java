package com.atos.studybuilder.model;

import javax.persistence.*;

@Entity
public class ObjectiveData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String objectiveFullText;
    private String objectiveLevel;
    private int protocolId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "protocolId", referencedColumnName = "protocolId",insertable = false,updatable = false)
    private StudyLevelContent studyLevelContent;

    public ObjectiveData(){}

    public ObjectiveData(int id, String objectiveFullText, String objectiveLevel, int protocolId) {
        this.id = id;
        this.objectiveFullText = objectiveFullText;
        this.objectiveLevel = objectiveLevel;
        this.protocolId = protocolId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjectiveFullText() {
        return objectiveFullText;
    }

    public void setObjectiveFullText(String objectiveFullText) {
        this.objectiveFullText = objectiveFullText;
    }

    public String getObjectiveLevel() {
        return objectiveLevel;
    }

    public void setObjectiveLevel(String objectiveLevel) {
        this.objectiveLevel = objectiveLevel;
    }

    public StudyLevelContent getStudyLevelContent() {
        return studyLevelContent;
    }

    public void setStudyLevelContent(StudyLevelContent studyLevelContent) {
        this.studyLevelContent = studyLevelContent;
    }

    public int getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(int protocolId) {
        this.protocolId = protocolId;
    }

    @Override
    public String toString() {
        return "ObjectiveData{" +
                "id=" + id +
                ", objectiveFullText='" + objectiveFullText + '\'' +
                ", objectiveLevel='" + objectiveLevel + '\'' +
                ", studyLevelContent=" + studyLevelContent +
                '}';
    }
}
