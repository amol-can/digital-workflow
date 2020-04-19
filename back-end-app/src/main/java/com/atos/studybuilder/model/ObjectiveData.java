package com.atos.studybuilder.model;

import javax.persistence.*;

@Entity
public class ObjectiveData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String objectiveFullText;
    private String objectiveLevel;
    private String protocolId;
    private String endPointFullText;
    private String primaryTimePoint;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "protocolId", referencedColumnName = "protocolId",insertable = false,updatable = false)
    private StudyLevelContent studyLevelContent;

    public ObjectiveData(){}

    public ObjectiveData(int id, String objectiveFullText, String objectiveLevel, String protocolId, String endPointFullText, String primaryTimePoint) {
        this.id = id;
        this.objectiveFullText = objectiveFullText;
        this.objectiveLevel = objectiveLevel;
        this.protocolId = protocolId;
        this.endPointFullText = endPointFullText;
        this.primaryTimePoint = primaryTimePoint;
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

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public String getEndPointFullText() {
        return endPointFullText;
    }

    public void setEndPointFullText(String endPointFullText) {
        this.endPointFullText = endPointFullText;
    }

    public String getPrimaryTimePoint() {
        return primaryTimePoint;
    }

    public void setPrimaryTimePoint(String primaryTimePoint) {
        this.primaryTimePoint = primaryTimePoint;
    }

    @Override
    public String toString() {
        return "ObjectiveData{" +
                "id=" + id +
                ", objectiveFullText='" + objectiveFullText + '\'' +
                ", objectiveLevel='" + objectiveLevel + '\'' +
                ", protocolId='" + protocolId + '\'' +
                ", endPointFullText='" + endPointFullText + '\'' +
                ", primaryTimePoint='" + primaryTimePoint + '\'' +
                ", studyLevelContent=" + studyLevelContent +
                '}';
    }
}
