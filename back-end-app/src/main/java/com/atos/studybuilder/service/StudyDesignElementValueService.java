package com.atos.studybuilder.service;

import com.atos.studybuilder.model.StudyDesignElementValue;
import com.atos.studybuilder.repository.StudyDesignElementValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudyDesignElementValueService {

    @Autowired
    StudyDesignElementValueRepository sdeValueRepository;

    /**
     * To return all study design element values
     * @return list of StudyDesignElementValue
     */
    public List<StudyDesignElementValue> studyDesignElementValueIndex(){
        List<StudyDesignElementValue> studyDesignElementValues = new ArrayList<>();
        sdeValueRepository.findAll().forEach(studyDesignElementValues::add);
        return studyDesignElementValues;
    }

    /**
     * To save the study design element value
     * @param studyDesignElementValue
     */
    public void studyDesignElementSave(StudyDesignElementValue studyDesignElementValue){
        sdeValueRepository.save(studyDesignElementValue);
    }

}
