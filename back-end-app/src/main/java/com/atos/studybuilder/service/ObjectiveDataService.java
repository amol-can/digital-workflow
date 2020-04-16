package com.atos.studybuilder.service;

import com.atos.studybuilder.model.ObjectiveData;
import com.atos.studybuilder.repository.ObjectiveDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObjectiveDataService {
    @Autowired
    ObjectiveDataRepository objectiveDataRepository;

    public List<ObjectiveData> objectiveDataList(){
        List<ObjectiveData> objectiveData = new ArrayList<>();
        objectiveDataRepository.findAll().forEach(objectiveData::add);
        return objectiveData;
    }

    public boolean objectiveDataSave(ObjectiveData objectiveData) throws Exception {
        try {
            objectiveDataRepository.save(objectiveData);
            return true;
        } catch (Exception e){
            System.out.println("Exception #ObjectiveDataSave "+ e.toString() );
            throw new Exception("API Exception while saving ObjectiveData "+ e.getLocalizedMessage());
        }
    }

    public ObjectiveData objectiveDataShow(int id) throws Exception {
        return objectiveDataRepository.findById(id)
                .orElseThrow(() -> new Exception("Given Protocol ID is not available"));
    }

    public void objectiveDataUpdate(ObjectiveData objectiveData){
        objectiveDataRepository.save(objectiveData);
    }

    public boolean objectiveDataDelete(int id){
        objectiveDataRepository.deleteById(id);
        return true;
    }
}

