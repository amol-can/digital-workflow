package com.atos.studybuilder.controller;

import com.atos.studybuilder.model.Objective;
import com.atos.studybuilder.service.ObjectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objectives")
public class ObjectiveController {

    @Autowired
    ObjectiveService objectiveService;

    @GetMapping()
    List<Objective> objectiveIndex(){
        return objectiveService.objectiveIndex();
    }

    @PostMapping(consumes = {"application/json", "application/xml"} )
    @ResponseStatus(HttpStatus.CREATED)
    void objectiveCreate(@RequestBody Objective objective){
        objectiveService.objectiveCreate(objective);
    }

}
