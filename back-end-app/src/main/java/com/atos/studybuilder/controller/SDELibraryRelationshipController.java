package com.atos.studybuilder.controller;

import com.atos.studybuilder.model.SDELibraryRelationship;
import com.atos.studybuilder.service.SDELibraryRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController()
@RequestMapping("/library-relationship")
public class SDELibraryRelationshipController {

    @Autowired
    SDELibraryRelationshipService sdeLibraryRelationshipService;

    @GetMapping(value = "",produces = {"application/json", "application/xml"})
    @ResponseBody
    List<SDELibraryRelationship> sdeLibraryRelationshipListByQParam(@RequestParam(name = "elementName",defaultValue = "") String elementName){
        if(elementName.isEmpty()){
            return sdeLibraryRelationshipService.sdeLibraryRelationshipList();
        }
        return sdeLibraryRelationshipService.sdeLibraryRelationshipListByQParam(elementName);
    }

    @PostMapping(value = "", consumes = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
    void sdeLibraryRelationshipSave(@RequestBody SDELibraryRelationship sdeLibraryRelationship){
        sdeLibraryRelationshipService.sdeLibraryRelationshipSave(sdeLibraryRelationship);
    }

    @GetMapping(value = "/{id}",produces = {"application/json","application/xml"})
    List<SDELibraryRelationship> sdeLibraryRelationshipShoW(@PathVariable(name = "id") String elementName) throws Exception {
        return sdeLibraryRelationshipService.sdeLibraryRelationshipListByQParam(elementName);
    }

    @PutMapping(value = "/{id}", consumes = {"application/json", "application/xml"})
    void sdeLibraryRelationshipUpdate(@PathVariable int id, @RequestBody SDELibraryRelationship sdeLibraryRelationship){
        sdeLibraryRelationshipService.sdeLibraryRelationshipUpdate(sdeLibraryRelationship);
    }

    @DeleteMapping(value = "/{id}", consumes = {"application/json", "application/xml"})
    void sdeLibraryRelationshipDelete(@PathVariable int id){
        sdeLibraryRelationshipService.sdeLibraryRelationshipDelete(id);
    }


}
