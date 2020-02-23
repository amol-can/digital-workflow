package com.atos.studybuilder.service;

import com.atos.studybuilder.model.StudyPhase;
import com.atos.studybuilder.repository.StudyPhaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudyPhaseService {

    @Autowired
    StudyPhaseRepository studyPhaseRepository;

    public void studyPhaseCreate(StudyPhase studyPhase) {
        studyPhaseRepository.save(studyPhase);
    }

    public List<StudyPhase> studyPhasesIndex() {
        List<StudyPhase> studyPhases = new ArrayList<>();
        studyPhaseRepository.findAll().forEach(studyPhases::add);
        return studyPhases;
    }

    // TODO need to and rest of the end points
}
