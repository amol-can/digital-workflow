package com.atos.studybuilder.controller;

import com.atos.studybuilder.model.StudyDesignElementLibrary;
import com.atos.studybuilder.service.SDELibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reference-library")
public class SDElementLibraryController {

    @Autowired
    SDELibraryService sdElementLibraryService;

    @GetMapping(produces = {"application/json","application/xml"})
    List<StudyDesignElementLibrary> studyDesignElementLibraryList(){
        return sdElementLibraryService.studyDesignElementLibraryList();
    }

    @PostMapping(consumes = {"application/json","application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
    void studyDesignElementLibrarySave(@RequestBody StudyDesignElementLibrary studyDesignElementLibrary){
        sdElementLibraryService.studyDesignElementLibrarySave(studyDesignElementLibrary);
    }

    @GetMapping("/{id}")
    StudyDesignElementLibrary studyDesignElementLibraryShow(@PathVariable int id) throws Exception {
        return sdElementLibraryService.studyDesignElementLibraryShow(id);
    }

    // TODO pass id as well
    @PutMapping("/{id}")
    void studyDesignElementLibraryUpdate(@RequestBody StudyDesignElementLibrary studyDesignElementLibrary, @PathVariable int id){
        sdElementLibraryService.studyDesignElementLibraryUpdate(studyDesignElementLibrary);
    }

}
