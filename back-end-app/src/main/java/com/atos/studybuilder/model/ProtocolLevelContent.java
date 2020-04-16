package com.atos.studybuilder.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProtocolLevelContent {
    @Id
    private String protocolId;
    private String acronym;
    private String protocolTitle;
    private String protocolShortTitle;

    private String armName;
    private String armType;
    private String armDescription;
    private String armName_1;
    private String armType_1;
    private String armDescription_1;
    private String armName_2;
    private String armType_2;
    private String armDescription_2;
    private String armName_3;
    private String armType_3;
    private String armDescription_3;
    private String armName_4;
    private String armType_4;
    private String armDescription_4;
    private String armName_5;
    private String armType_5;
    private String armDescription_5;

    private String interventionModel;
    private String interventionName;
    private String interventionDescription;
    private String interventionType;
    private String interventionModel_1;
    private String interventionName_1;
    private String interventionDescription_1;
    private String interventionType_1;
    private String interventionModel_2;
    private String interventionName_2;
    private String interventionDescription_2;
    private String interventionType_2;
    private String interventionModel_3;
    private String interventionName_3;
    private String interventionDescription_3;
    private String interventionType_3;
    private String interventionModel_4;
    private String interventionName_4;
    private String interventionDescription_4;
    private String interventionType_4;
    private String interventionModel_5;
    private String interventionName_5;
    private String interventionDescription_5;
    private String interventionType_5;

    private String masking;
    private int numberOfArms;

    public ProtocolLevelContent(){}

    public ProtocolLevelContent(String protocolId, String acronym, String protocolTitle, String protocolShortTitle, String armName, String armType, String armDescription, String armName_1, String armType_1, String armDescription_1, String armName_2, String armType_2, String armDescription_2, String armName_3, String armType_3, String armDescription_3, String armName_4, String armType_4, String armDescription_4, String armName_5, String armType_5, String armDescription_5, String interventionModel, String interventionName, String interventionDescription, String interventionType, String interventionModel_1, String interventionName_1, String interventionDescription_1, String interventionType_1, String interventionModel_2, String interventionName_2, String interventionDescription_2, String interventionType_2, String interventionModel_3, String interventionName_3, String interventionDescription_3, String interventionType_3, String interventionModel_4, String interventionName_4, String interventionDescription_4, String interventionType_4, String interventionModel_5, String interventionName_5, String interventionDescription_5, String interventionType_5, String masking, int numberOfArms) {
        this.protocolId = protocolId;
        this.acronym = acronym;
        this.protocolTitle = protocolTitle;
        this.protocolShortTitle = protocolShortTitle;
        this.armName = armName;
        this.armType = armType;
        this.armDescription = armDescription;
        this.armName_1 = armName_1;
        this.armType_1 = armType_1;
        this.armDescription_1 = armDescription_1;
        this.armName_2 = armName_2;
        this.armType_2 = armType_2;
        this.armDescription_2 = armDescription_2;
        this.armName_3 = armName_3;
        this.armType_3 = armType_3;
        this.armDescription_3 = armDescription_3;
        this.armName_4 = armName_4;
        this.armType_4 = armType_4;
        this.armDescription_4 = armDescription_4;
        this.armName_5 = armName_5;
        this.armType_5 = armType_5;
        this.armDescription_5 = armDescription_5;
        this.interventionModel = interventionModel;
        this.interventionName = interventionName;
        this.interventionDescription = interventionDescription;
        this.interventionType = interventionType;
        this.interventionModel_1 = interventionModel_1;
        this.interventionName_1 = interventionName_1;
        this.interventionDescription_1 = interventionDescription_1;
        this.interventionType_1 = interventionType_1;
        this.interventionModel_2 = interventionModel_2;
        this.interventionName_2 = interventionName_2;
        this.interventionDescription_2 = interventionDescription_2;
        this.interventionType_2 = interventionType_2;
        this.interventionModel_3 = interventionModel_3;
        this.interventionName_3 = interventionName_3;
        this.interventionDescription_3 = interventionDescription_3;
        this.interventionType_3 = interventionType_3;
        this.interventionModel_4 = interventionModel_4;
        this.interventionName_4 = interventionName_4;
        this.interventionDescription_4 = interventionDescription_4;
        this.interventionType_4 = interventionType_4;
        this.interventionModel_5 = interventionModel_5;
        this.interventionName_5 = interventionName_5;
        this.interventionDescription_5 = interventionDescription_5;
        this.interventionType_5 = interventionType_5;
        this.masking = masking;
        this.numberOfArms = numberOfArms;
    }

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getProtocolTitle() {
        return protocolTitle;
    }

    public void setProtocolTitle(String protocolTitle) {
        this.protocolTitle = protocolTitle;
    }

    public String getProtocolShortTitle() {
        return protocolShortTitle;
    }

    public void setProtocolShortTitle(String protocolShortTitle) {
        this.protocolShortTitle = protocolShortTitle;
    }

    public String getArmName() {
        return armName;
    }

    public void setArmName(String armName) {
        this.armName = armName;
    }

    public String getArmType() {
        return armType;
    }

    public void setArmType(String armType) {
        this.armType = armType;
    }

    public String getArmDescription() {
        return armDescription;
    }

    public void setArmDescription(String armDescription) {
        this.armDescription = armDescription;
    }

    public String getArmName_1() {
        return armName_1;
    }

    public void setArmName_1(String armName_1) {
        this.armName_1 = armName_1;
    }

    public String getArmType_1() {
        return armType_1;
    }

    public void setArmType_1(String armType_1) {
        this.armType_1 = armType_1;
    }

    public String getArmDescription_1() {
        return armDescription_1;
    }

    public void setArmDescription_1(String armDescription_1) {
        this.armDescription_1 = armDescription_1;
    }

    public String getArmName_2() {
        return armName_2;
    }

    public void setArmName_2(String armName_2) {
        this.armName_2 = armName_2;
    }

    public String getArmType_2() {
        return armType_2;
    }

    public void setArmType_2(String armType_2) {
        this.armType_2 = armType_2;
    }

    public String getArmDescription_2() {
        return armDescription_2;
    }

    public void setArmDescription_2(String armDescription_2) {
        this.armDescription_2 = armDescription_2;
    }

    public String getArmName_3() {
        return armName_3;
    }

    public void setArmName_3(String armName_3) {
        this.armName_3 = armName_3;
    }

    public String getArmType_3() {
        return armType_3;
    }

    public void setArmType_3(String armType_3) {
        this.armType_3 = armType_3;
    }

    public String getArmDescription_3() {
        return armDescription_3;
    }

    public void setArmDescription_3(String armDescription_3) {
        this.armDescription_3 = armDescription_3;
    }

    public String getArmName_4() {
        return armName_4;
    }

    public void setArmName_4(String armName_4) {
        this.armName_4 = armName_4;
    }

    public String getArmType_4() {
        return armType_4;
    }

    public void setArmType_4(String armType_4) {
        this.armType_4 = armType_4;
    }

    public String getArmDescription_4() {
        return armDescription_4;
    }

    public void setArmDescription_4(String armDescription_4) {
        this.armDescription_4 = armDescription_4;
    }

    public String getArmName_5() {
        return armName_5;
    }

    public void setArmName_5(String armName_5) {
        this.armName_5 = armName_5;
    }

    public String getArmType_5() {
        return armType_5;
    }

    public void setArmType_5(String armType_5) {
        this.armType_5 = armType_5;
    }

    public String getArmDescription_5() {
        return armDescription_5;
    }

    public void setArmDescription_5(String armDescription_5) {
        this.armDescription_5 = armDescription_5;
    }

    public String getInterventionModel() {
        return interventionModel;
    }

    public void setInterventionModel(String interventionModel) {
        this.interventionModel = interventionModel;
    }

    public String getInterventionName() {
        return interventionName;
    }

    public void setInterventionName(String interventionName) {
        this.interventionName = interventionName;
    }

    public String getInterventionDescription() {
        return interventionDescription;
    }

    public void setInterventionDescription(String interventionDescription) {
        this.interventionDescription = interventionDescription;
    }

    public String getInterventionType() {
        return interventionType;
    }

    public void setInterventionType(String interventionType) {
        this.interventionType = interventionType;
    }

    public String getInterventionModel_1() {
        return interventionModel_1;
    }

    public void setInterventionModel_1(String interventionModel_1) {
        this.interventionModel_1 = interventionModel_1;
    }

    public String getInterventionName_1() {
        return interventionName_1;
    }

    public void setInterventionName_1(String interventionName_1) {
        this.interventionName_1 = interventionName_1;
    }

    public String getInterventionDescription_1() {
        return interventionDescription_1;
    }

    public void setInterventionDescription_1(String interventionDescription_1) {
        this.interventionDescription_1 = interventionDescription_1;
    }

    public String getInterventionType_1() {
        return interventionType_1;
    }

    public void setInterventionType_1(String interventionType_1) {
        this.interventionType_1 = interventionType_1;
    }

    public String getInterventionModel_2() {
        return interventionModel_2;
    }

    public void setInterventionModel_2(String interventionModel_2) {
        this.interventionModel_2 = interventionModel_2;
    }

    public String getInterventionName_2() {
        return interventionName_2;
    }

    public void setInterventionName_2(String interventionName_2) {
        this.interventionName_2 = interventionName_2;
    }

    public String getInterventionDescription_2() {
        return interventionDescription_2;
    }

    public void setInterventionDescription_2(String interventionDescription_2) {
        this.interventionDescription_2 = interventionDescription_2;
    }

    public String getInterventionType_2() {
        return interventionType_2;
    }

    public void setInterventionType_2(String interventionType_2) {
        this.interventionType_2 = interventionType_2;
    }

    public String getInterventionModel_3() {
        return interventionModel_3;
    }

    public void setInterventionModel_3(String interventionModel_3) {
        this.interventionModel_3 = interventionModel_3;
    }

    public String getInterventionName_3() {
        return interventionName_3;
    }

    public void setInterventionName_3(String interventionName_3) {
        this.interventionName_3 = interventionName_3;
    }

    public String getInterventionDescription_3() {
        return interventionDescription_3;
    }

    public void setInterventionDescription_3(String interventionDescription_3) {
        this.interventionDescription_3 = interventionDescription_3;
    }

    public String getInterventionType_3() {
        return interventionType_3;
    }

    public void setInterventionType_3(String interventionType_3) {
        this.interventionType_3 = interventionType_3;
    }

    public String getInterventionModel_4() {
        return interventionModel_4;
    }

    public void setInterventionModel_4(String interventionModel_4) {
        this.interventionModel_4 = interventionModel_4;
    }

    public String getInterventionName_4() {
        return interventionName_4;
    }

    public void setInterventionName_4(String interventionName_4) {
        this.interventionName_4 = interventionName_4;
    }

    public String getInterventionDescription_4() {
        return interventionDescription_4;
    }

    public void setInterventionDescription_4(String interventionDescription_4) {
        this.interventionDescription_4 = interventionDescription_4;
    }

    public String getInterventionType_4() {
        return interventionType_4;
    }

    public void setInterventionType_4(String interventionType_4) {
        this.interventionType_4 = interventionType_4;
    }

    public String getInterventionModel_5() {
        return interventionModel_5;
    }

    public void setInterventionModel_5(String interventionModel_5) {
        this.interventionModel_5 = interventionModel_5;
    }

    public String getInterventionName_5() {
        return interventionName_5;
    }

    public void setInterventionName_5(String interventionName_5) {
        this.interventionName_5 = interventionName_5;
    }

    public String getInterventionDescription_5() {
        return interventionDescription_5;
    }

    public void setInterventionDescription_5(String interventionDescription_5) {
        this.interventionDescription_5 = interventionDescription_5;
    }

    public String getInterventionType_5() {
        return interventionType_5;
    }

    public void setInterventionType_5(String interventionType_5) {
        this.interventionType_5 = interventionType_5;
    }

    public String getMasking() {
        return masking;
    }

    public void setMasking(String masking) {
        this.masking = masking;
    }

    public int getNumberOfArms() {
        return numberOfArms;
    }

    public void setNumberOfArms(int numberOfArms) {
        this.numberOfArms = numberOfArms;
    }

    @Override
    public String toString() {
        return "ProtocolLevelContent{" +
                "protocolId='" + protocolId + '\'' +
                ", acronym='" + acronym + '\'' +
                ", protocolTitle='" + protocolTitle + '\'' +
                ", protocolShortTitle='" + protocolShortTitle + '\'' +
                ", armName='" + armName + '\'' +
                ", armType='" + armType + '\'' +
                ", armDescription='" + armDescription + '\'' +
                ", armName_1='" + armName_1 + '\'' +
                ", armType_1='" + armType_1 + '\'' +
                ", armDescription_1='" + armDescription_1 + '\'' +
                ", armName_2='" + armName_2 + '\'' +
                ", armType_2='" + armType_2 + '\'' +
                ", armDescription_2='" + armDescription_2 + '\'' +
                ", armName_3='" + armName_3 + '\'' +
                ", armType_3='" + armType_3 + '\'' +
                ", armDescription_3='" + armDescription_3 + '\'' +
                ", armName_4='" + armName_4 + '\'' +
                ", armType_4='" + armType_4 + '\'' +
                ", armDescription_4='" + armDescription_4 + '\'' +
                ", armName_5='" + armName_5 + '\'' +
                ", armType_5='" + armType_5 + '\'' +
                ", armDescription_5='" + armDescription_5 + '\'' +
                ", interventionModel='" + interventionModel + '\'' +
                ", interventionName='" + interventionName + '\'' +
                ", interventionDescription='" + interventionDescription + '\'' +
                ", interventionType='" + interventionType + '\'' +
                ", interventionModel_1='" + interventionModel_1 + '\'' +
                ", interventionName_1='" + interventionName_1 + '\'' +
                ", interventionDescription_1='" + interventionDescription_1 + '\'' +
                ", interventionType_1='" + interventionType_1 + '\'' +
                ", interventionModel_2='" + interventionModel_2 + '\'' +
                ", interventionName_2='" + interventionName_2 + '\'' +
                ", interventionDescription_2='" + interventionDescription_2 + '\'' +
                ", interventionType_2='" + interventionType_2 + '\'' +
                ", interventionModel_3='" + interventionModel_3 + '\'' +
                ", interventionName_3='" + interventionName_3 + '\'' +
                ", interventionDescription_3='" + interventionDescription_3 + '\'' +
                ", interventionType_3='" + interventionType_3 + '\'' +
                ", interventionModel_4='" + interventionModel_4 + '\'' +
                ", interventionName_4='" + interventionName_4 + '\'' +
                ", interventionDescription_4='" + interventionDescription_4 + '\'' +
                ", interventionType_4='" + interventionType_4 + '\'' +
                ", interventionModel_5='" + interventionModel_5 + '\'' +
                ", interventionName_5='" + interventionName_5 + '\'' +
                ", interventionDescription_5='" + interventionDescription_5 + '\'' +
                ", interventionType_5='" + interventionType_5 + '\'' +
                ", masking='" + masking + '\'' +
                ", numberOfArms=" + numberOfArms +
                '}';
    }
}
