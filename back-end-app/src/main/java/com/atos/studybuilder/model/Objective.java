package com.atos.studybuilder.model;

import javax.persistence.*;

enum ObjectiveLevel{
    PRIMARY, SECONDARY, TERTIARY, EXPLORATORY;
}

@Entity
public class Objective {

    public Objective(){   }

    public Objective(String objectiveFullText, ObjectiveLevel objectiveLevel, String objectiveBiomedicalConcept,
                     String objectiveAnalysisType, String objectivePrimaryTimepoint, String objectiveSecondaryTimepoint) {
        this.objectiveFullText = objectiveFullText;
        this.objectiveLevel = objectiveLevel;
        this.objectiveBiomedicalConcept = objectiveBiomedicalConcept;
        this.objectiveAnalysisType = objectiveAnalysisType;
        this.objectivePrimaryTimepoint = objectivePrimaryTimepoint;
        this.objectiveSecondaryTimepoint = objectiveSecondaryTimepoint;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int objectiveId;

    @Column(name = "objective_full_text", nullable = false)
    private String objectiveFullText;

    @Column(name = "objective_level")
    private ObjectiveLevel objectiveLevel;

    @Column(name = "biomedical_concept")
    private String objectiveBiomedicalConcept;

    @Column(name = "analysis_type")
    private String objectiveAnalysisType;

    @Column(name = "primary_timepoint", nullable = false)
    private String objectivePrimaryTimepoint;

    @Column(name = "secondary_timepoint")
    private String objectiveSecondaryTimepoint;

    public int getObjectiveId() {
        return objectiveId;
    }

    public void setObjectiveId(int objectiveId) {
        this.objectiveId = objectiveId;
    }

    public String getObjectiveFullText() {
        return objectiveFullText;
    }

    public void setObjectiveFullText(String objectiveFullText) {
        this.objectiveFullText = objectiveFullText;
    }

    public ObjectiveLevel getObjectiveLevel() {
        return objectiveLevel;
    }

    public void setObjectiveLevel(ObjectiveLevel objectiveLevel) {
        this.objectiveLevel = objectiveLevel;
    }

    public String getObjectiveBiomedicalConcept() {
        return objectiveBiomedicalConcept;
    }

    public void setObjectiveBiomedicalConcept(String objectiveBiomedicalConcept) {
        this.objectiveBiomedicalConcept = objectiveBiomedicalConcept;
    }

    public String getObjectiveAnalysisType() {
        return objectiveAnalysisType;
    }

    public void setObjectiveAnalysisType(String objectiveAnalysisType) {
        this.objectiveAnalysisType = objectiveAnalysisType;
    }

    public String getObjectivePrimaryTimepoint() {
        return objectivePrimaryTimepoint;
    }

    public void setObjectivePrimaryTimepoint(String objectivePrimaryTimepoint) {
        this.objectivePrimaryTimepoint = objectivePrimaryTimepoint;
    }

    public String getObjectiveSecondaryTimepoint() {
        return objectiveSecondaryTimepoint;
    }

    public void setObjectiveSecondaryTimepoint(String objectiveSecondaryTimepoint) {
        this.objectiveSecondaryTimepoint = objectiveSecondaryTimepoint;
    }

    @Override
    public String toString() {
        return "Objective{" +
                "objectiveId='" + objectiveId + '\'' +
                ", objectiveFullText='" + objectiveFullText + '\'' +
                ", objectiveLevel=" + objectiveLevel +
                ", objectiveBiomedicalConcept='" + objectiveBiomedicalConcept + '\'' +
                ", objectiveAnalysisType='" + objectiveAnalysisType + '\'' +
                ", objectivePrimaryTimepoint='" + objectivePrimaryTimepoint + '\'' +
                ", objectiveSecondaryTimepoint='" + objectiveSecondaryTimepoint + '\'' +
                '}';
    }
}
