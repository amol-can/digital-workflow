package com.atos.studybuilder.service;

import com.atos.studybuilder.model.Objective;
import com.atos.studybuilder.repository.ObjectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObjectiveService {

    @Autowired
    ObjectiveRepository objectiveRepository;

    public void objectiveCreate(Objective objective){
        objectiveRepository.save(objective);
    }

    public List<Objective> objectiveIndex(){
        List<Objective> objectives = new ArrayList<>();
        objectiveRepository.findAll().forEach(objectives::add);
        return objectives;
    }

    // TODO need to and rest of the end points

}
