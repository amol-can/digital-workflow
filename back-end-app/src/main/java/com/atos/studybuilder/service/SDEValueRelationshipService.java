package com.atos.studybuilder.service;

import com.atos.studybuilder.model.SDEValueRelationship;
import com.atos.studybuilder.repository.SDEValueRelationshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SDEValueRelationshipService {

    @Autowired
    SDEValueRelationshipRepository sdeValueRelationshipRepository;

    public List<SDEValueRelationship> sdeValueRelationshipList() {
        List<SDEValueRelationship> sdeValueRelationships = new ArrayList<>();
        sdeValueRelationshipRepository.findAll().forEach(sdeValueRelationships::add);
        return sdeValueRelationships;
    }

    public void sdeValueRelationshipCreate(SDEValueRelationship sdeValueRelationship) {
        sdeValueRelationshipRepository.save(sdeValueRelationship);
    }

    public SDEValueRelationship sdeValueRelationshipShow(int valueRelationshipId) throws Exception {
        return sdeValueRelationshipRepository.findById(valueRelationshipId)
                .orElseThrow(()-> new Exception("sdeValueRelationship does not find for given Id: "+ valueRelationshipId));
    }

    public void sdeValueRelationshipUpdate(SDEValueRelationship sdeValueRelationship, int id) {
        sdeValueRelationshipRepository.save(sdeValueRelationship);
    }

    public void sdeValueRelationshipDelete(int valueRelationshipId) {
        sdeValueRelationshipRepository.deleteById(valueRelationshipId);
    }

}
