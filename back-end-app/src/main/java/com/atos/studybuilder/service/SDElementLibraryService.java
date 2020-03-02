package com.atos.studybuilder.service;

import com.atos.studybuilder.model.StudyDesignElementLibrary;
import com.atos.studybuilder.repository.SDElementLibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SDElementLibraryService {

    @Autowired
    SDElementLibraryRepository sdElementLibraryRepository;

    public List<StudyDesignElementLibrary> studyDesignElementLibraryList(){
        List<StudyDesignElementLibrary> studyDesignElementLibraries = new ArrayList<>();
        sdElementLibraryRepository.findAll().forEach(studyDesignElementLibraries::add);
        return studyDesignElementLibraries;
    }

    public void studyDesignElementLibrarySave(StudyDesignElementLibrary studyDesignElementLibrary){
        sdElementLibraryRepository.save(studyDesignElementLibrary);
    }

}
