package com.atos.studybuilder.service;

import com.atos.studybuilder.model.StudyLevelContent;
import com.atos.studybuilder.repository.StudyLevelContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudyLevelContentService {

    @Autowired
    StudyLevelContentRepository studyLevelContentRepository;

    public List<StudyLevelContent> studyLevelContentList(){
        List<StudyLevelContent> studyLevelContents = new ArrayList<>();
        studyLevelContentRepository.findAll().forEach(studyLevelContents::add);
        return studyLevelContents;
    }

    public boolean studyLevelContentSave(StudyLevelContent studyLevelContent) throws Exception {
        try {
            studyLevelContentRepository.save(studyLevelContent);
            return true;
        } catch (Exception e){
            System.out.println("Exception #studyLevelContentSave "+ e.toString() );
            throw new Exception("API Exception while saving StudyLevelContent "+ e.getLocalizedMessage());
        }
    }

    public StudyLevelContent studyLevelContentShow(String protocolId) throws Exception {
        return studyLevelContentRepository.findById(protocolId)
                .orElseThrow(() -> new Exception("Given Protocol ID is not available"));
    }

    public void studyLevelContentUpdate(StudyLevelContent studyLevelContent){
        studyLevelContentRepository.save(studyLevelContent);
    }

    public boolean studyLevelContentDelete(String protocolId){
        studyLevelContentRepository.deleteById(protocolId);
        return true;
    }

}
