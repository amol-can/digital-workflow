package com.atos.studybuilder.controller;

import com.atos.studybuilder.model.ObjectiveData;
import com.atos.studybuilder.service.ObjectiveDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objective-data")
public class ObjectiveDataController {
    @Autowired
    ObjectiveDataService objectiveDataService;

    @GetMapping
    List<ObjectiveData> objectiveDataList(){
        return objectiveDataService.objectiveDataList();
    }

    @PostMapping(consumes = {"application/json","application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
    boolean objectiveDataList(@RequestBody ObjectiveData objectiveData) throws Exception {
        return objectiveDataService.objectiveDataSave(objectiveData);
    }

    @DeleteMapping(value = "/{protocolId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    boolean objectiveDataDelete(@PathVariable int protocolId){
        return objectiveDataService.objectiveDataDelete(protocolId);
    }

    @GetMapping(value = "/{protocolId}")
    ObjectiveData objectiveDataShow(@PathVariable int protocolId) throws Exception {
        return objectiveDataService.objectiveDataShow(protocolId);
    }

    @PutMapping(value = "/{protocolId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void objectiveDataUpdate(@RequestBody ObjectiveData objectiveData, @PathVariable String protocolId){
        objectiveDataService.objectiveDataUpdate(objectiveData);
    }

}
