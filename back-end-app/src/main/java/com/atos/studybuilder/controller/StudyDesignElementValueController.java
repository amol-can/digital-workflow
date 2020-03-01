package com.atos.studybuilder.controller;

import com.atos.studybuilder.model.StudyDesignElementValue;
import com.atos.studybuilder.service.StudyDesignElementValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reference-value")
public class StudyDesignElementValueController {

    @Autowired
    StudyDesignElementValueService sdeValueService;

    @GetMapping(produces = {"application/json", "application/xml"})
    List<StudyDesignElementValue> studyDesignElementValueIndex() {
        return sdeValueService.studyDesignElementValueIndex();
    }

    @PostMapping(consumes = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
    void studyDesignElementValueSave(@RequestBody StudyDesignElementValue sdeValue){
        sdeValueService.studyDesignElementSave(sdeValue);
    }


}
