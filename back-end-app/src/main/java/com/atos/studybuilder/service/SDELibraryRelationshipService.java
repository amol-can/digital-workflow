package com.atos.studybuilder.service;

import com.atos.studybuilder.model.SDELibraryRelationship;
import com.atos.studybuilder.repository.SDELibraryRelationshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SDELibraryRelationshipService {

    @Autowired
    SDELibraryRelationshipRepository sdeLibraryRelationshipRepository;

    public List<SDELibraryRelationship> sdeLibraryRelationshipList(){
        List<SDELibraryRelationship> sdeLibraryRelationships = new ArrayList<>();
        sdeLibraryRelationshipRepository.findAll().forEach(sdeLibraryRelationships::add);
        return sdeLibraryRelationships;
    }

    public List<SDELibraryRelationship> sdeLibraryRelationshipListByQParam(String elementName ){
        List<SDELibraryRelationship> sdeLibraryRelationships = new ArrayList<>();
        sdeLibraryRelationshipRepository.findByElementType(elementName).forEach(sdeLibraryRelationships::add);
        return sdeLibraryRelationships;
    }

    public void sdeLibraryRelationshipSave(SDELibraryRelationship sdeLibraryRelationship){
        sdeLibraryRelationshipRepository.save(sdeLibraryRelationship);
    }

    public void sdeLibraryRelationshipUpdate(SDELibraryRelationship sdeLibraryRelationship){
        sdeLibraryRelationshipRepository.save(sdeLibraryRelationship);
    }

    public SDELibraryRelationship sdeLibraryRelationshipShow(int relationshipId) throws Exception {
        return sdeLibraryRelationshipRepository.findById(relationshipId)
                .orElseThrow(() -> new Exception("Library Relationship record not found"));
    }

    public void sdeLibraryRelationshipDelete(int relationshipId){
        sdeLibraryRelationshipRepository.deleteById(relationshipId);
    }

    // TODO saveAll update for batch updating


}
