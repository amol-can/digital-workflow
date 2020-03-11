package com.atos.studybuilder.controller;

import com.atos.studybuilder.model.SDELibraryRelationship;
import com.atos.studybuilder.service.SDELibraryRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/library-relationship")
public class SDELibraryRelationshipController {

    @Autowired
    SDELibraryRelationshipService sdeLibraryRelationshipService;

    @GetMapping(value = "", produces = {"application/json", "application/xml"})
    List<SDELibraryRelationship> sdeLibraryRelationshipList() {
        return sdeLibraryRelationshipService.sdeLibraryRelationshipList();
    }

    @PostMapping(value = "", consumes = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
    void sdeLibraryRelationshipSave(@RequestBody SDELibraryRelationship sdeLibraryRelationship){
        sdeLibraryRelationshipService.sdeLibraryRelationshipSave(sdeLibraryRelationship);
    }

    @GetMapping(value = "/{id}",produces = {"application/json","application/xml"})
    SDELibraryRelationship sdeLibraryRelationshipShoW(@PathVariable int id) throws Exception {
        return sdeLibraryRelationshipService.sdeLibraryRelationshipShow(id);
    }

    @PutMapping(value = "/{id}", consumes = {"application/json", "application/xml"})
    void sdeLibraryRelationshipUpdate(@PathVariable int id, @RequestBody SDELibraryRelationship sdeLibraryRelationship){
        sdeLibraryRelationshipService.sdeLibraryRelationshipUpdate(sdeLibraryRelationship);
    }


}
