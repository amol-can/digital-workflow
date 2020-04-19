package com.atos.studybuilder.controller;

import com.atos.studybuilder.model.StudyPhase;
import com.atos.studybuilder.service.StudyPhaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/study-phases")
public class StudyPhaseController {

    @Autowired
    StudyPhaseService studyPhaseService;

    @GetMapping()
    List<StudyPhase> studyPhaseList() {
        return studyPhaseService.studyPhasesIndex();
    }

    @PostMapping(produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
    void studyPhaseCreate(@RequestBody StudyPhase studyPhase) {
        studyPhaseService.studyPhaseCreate(studyPhase);
    }

}
