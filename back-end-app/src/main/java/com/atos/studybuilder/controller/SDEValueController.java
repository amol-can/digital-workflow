package com.atos.studybuilder.controller;

import com.atos.studybuilder.model.StudyDesignElementValue;
import com.atos.studybuilder.service.SDEValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/reference-value")
public class SDEValueController {

    @Autowired
    SDEValueService sdeValueService;

    @GetMapping(produces = {"application/json", "application/xml"})
    List<StudyDesignElementValue> studyDesignElementValueIndex(@RequestParam(name = "elementName", defaultValue = "")
                                                                       String elementName) {
        if (elementName.isEmpty()) {
            return sdeValueService.studyDesignElementValueIndex();
        }
        return sdeValueService.studyDesignElementValueShow(elementName);
    }

    @PostMapping(consumes = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
    void studyDesignElementValueSave(@RequestBody StudyDesignElementValue sdeValue){
        sdeValueService.studyDesignElementValueSave(sdeValue);
    }

    //

    @GetMapping(value = "/{sdeId}",produces = {"application/json", "application/xml"})
    StudyDesignElementValue studyDesignElementValueShow(@PathVariable("sdeId") int studyDesignElementId) throws Exception {
        return sdeValueService.studyDesignElementValueShow(studyDesignElementId);
    }

    @DeleteMapping("/{id}")
    void studyDesignElementValueDelete(@PathVariable int id){
        sdeValueService.studyDesignElementValueDelete(id);
    }


}
