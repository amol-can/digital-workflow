package com.atos.studybuilder.controller;

import com.atos.studybuilder.model.SDEValueRelationship;
import com.atos.studybuilder.service.SDEValueRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/value-relationship")
public class SDEValueRelationshipController {

    @Autowired
    SDEValueRelationshipService sdeValueRelationshipService;

    @GetMapping(value = "", produces = {"application/json", "application/xml"})
    List<SDEValueRelationship> sdeValueRelationshipList() {
        return sdeValueRelationshipService.sdeValueRelationshipList();
    }

    @PostMapping(value = "", consumes = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
    void sdeValueRelationshipCreate(@RequestBody SDEValueRelationship sdeValueRelationship) {
        sdeValueRelationshipService.sdeValueRelationshipCreate(sdeValueRelationship);
    }

    @GetMapping(value = "/{id}", produces = {"application/json","application/xml"})
    SDEValueRelationship sdeValueRelationshipShow(@PathVariable int id) throws Exception {
        return sdeValueRelationshipService.sdeValueRelationshipShow(id);
    }

    @PutMapping(value = "/{id}", consumes = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.ACCEPTED)
    void sdeValueRelationshipUpdate(@RequestBody SDEValueRelationship sdeValueRelationship, @PathVariable int id) {
        sdeValueRelationshipService.sdeValueRelationshipUpdate(sdeValueRelationship, id);
    }

    @DeleteMapping("/{id}")
    void sdeValueRelationshipDelete(@PathVariable int id) {
        sdeValueRelationshipService.sdeValueRelationshipDelete(id);
    }

}
