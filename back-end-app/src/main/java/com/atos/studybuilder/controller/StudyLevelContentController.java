package com.atos.studybuilder.controller;

import com.atos.studybuilder.model.StudyLevelContent;
import com.atos.studybuilder.service.StudyLevelContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/study-level")
public class StudyLevelContentController {
    @Autowired
    StudyLevelContentService studyLevelContentService;

    @GetMapping
    List<StudyLevelContent> studyLevelContentList(){
        return studyLevelContentService.studyLevelContentList();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    boolean studyLevelContentList(@RequestBody StudyLevelContent studyLevelContent) throws Exception {
        return studyLevelContentService.studyLevelContentSave(studyLevelContent);
    }

    @DeleteMapping(value = "/{protocolId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    boolean studyLevelContentDelete(@PathVariable String protocolId){
        return studyLevelContentService.studyLevelContentDelete(protocolId);
    }

    @GetMapping(value = "/{protocolId}")
    StudyLevelContent studyLevelContentShow(@PathVariable String protocolId) throws Exception {
        return studyLevelContentService.studyLevelContentShow(protocolId);
    }

    @PutMapping(value = "/{protocolId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void studyLevelContentUpdate(@RequestBody StudyLevelContent studyLevelContent, @PathVariable String protocolId){
        studyLevelContentService.studyLevelContentUpdate(studyLevelContent);
    }

}
