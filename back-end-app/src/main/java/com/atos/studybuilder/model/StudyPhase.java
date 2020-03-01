package com.atos.studybuilder.model;

import javax.persistence.*;

@Table(name = "study_phase")
@Entity
public class StudyPhase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "study_phase_id")
    private int studyPhaseId;
    private String phase;

    private int protocolId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "protocolId", referencedColumnName = "id",insertable = false,updatable = false)
    private Protocol protocol;

    public StudyPhase() {
    }

    public StudyPhase(String phase, int protocolId) {
        this.phase = phase;
        this.protocolId = protocolId;
    }

    public int getStudyId() {
        return studyPhaseId;
    }

    public void setStudyId(int studyId) {
        this.studyPhaseId = studyId;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public int getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(int protocolId) {
        this.protocolId = protocolId;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    @Override
    public String toString() {
        return "StudyPhase{" +
                "studyId=" + studyPhaseId +
                ", phase='" + phase + '\'' +
                ", protocolId=" + protocolId +
                ", protocol=" + protocol +
                '}';
    }
}
