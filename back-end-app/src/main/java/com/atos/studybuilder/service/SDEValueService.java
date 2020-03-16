package com.atos.studybuilder.service;

import com.atos.studybuilder.model.StudyDesignElementValue;
import com.atos.studybuilder.repository.StudyDesignElementValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SDEValueService {

    @Autowired
    StudyDesignElementValueRepository sdeValueRepository;

    /**
     * To return all study design element values
     *
     * @return list of StudyDesignElementValue
     */
    public List<StudyDesignElementValue> studyDesignElementValueIndex() {
        List<StudyDesignElementValue> studyDesignElementValues = new ArrayList<>();
        sdeValueRepository.findAll().forEach(studyDesignElementValues::add);
        return studyDesignElementValues;
    }

    /**
     * To save the study design element value
     *
     * @param studyDesignElementValue
     */
    public void studyDesignElementValueSave(StudyDesignElementValue studyDesignElementValue) {
        sdeValueRepository.save(studyDesignElementValue);
    }

    public void studyDesignElementValueUpdate(StudyDesignElementValue studyDesignElementValue) {
        sdeValueRepository.save(studyDesignElementValue);
    }

    public StudyDesignElementValue studyDesignElementValueShow(int elementValuesId) throws Exception {
        return sdeValueRepository.findById(elementValuesId).
                orElseThrow(() -> new Exception("study Design ElementValue is not available"));
    }

    public List<StudyDesignElementValue> studyDesignElementValueShow(String studyDesignElement) {
        List<StudyDesignElementValue> studyDesignElementValues = new ArrayList<>();
        sdeValueRepository.findByStudyDesignElement(studyDesignElement).forEach(studyDesignElementValues::add);
        return studyDesignElementValues;
    }

    // TODO delete after simulated in Typescript
    public Map<String, StudyDesignElementValue> studyDesignElementValueShowUnique() {
        Map<String, StudyDesignElementValue> studyDesignElementValues = new HashMap<>();
        List<StudyDesignElementValue> sd = sdeValueRepository.findAll();
        for (StudyDesignElementValue studyDesignElementValue : sd) {
            studyDesignElementValues.put(studyDesignElementValue.getStudyDesignElement(), studyDesignElementValue);
        }
        return studyDesignElementValues;
    }

    public void studyDesignElementValueDelete(int elementId) {
        sdeValueRepository.deleteById(elementId);
    }

}
