package com.atos.studybuilder.service;

import com.atos.studybuilder.model.StudyDesignElementLibrary;
import com.atos.studybuilder.repository.SDElementLibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SDELibraryService {

    @Autowired
    SDElementLibraryRepository sdElementLibraryRepository;

    public List<StudyDesignElementLibrary> studyDesignElementLibraryList() {
        List<StudyDesignElementLibrary> studyDesignElementLibraries = new ArrayList<>();
        sdElementLibraryRepository.findAll().forEach(studyDesignElementLibraries::add);
        return studyDesignElementLibraries;
    }

    public void studyDesignElementLibrarySave(StudyDesignElementLibrary studyDesignElementLibrary) {
        sdElementLibraryRepository.save(studyDesignElementLibrary);
    }

    public StudyDesignElementLibrary studyDesignElementLibraryShow(int id) throws Exception {
        return sdElementLibraryRepository.findById(id)
                .orElseThrow(() -> new Exception("Given Study Design Element Library ID is not available"));
    }

    public void studyDesignElementLibraryUpdate(StudyDesignElementLibrary studyDesignElementLibrary) {
        sdElementLibraryRepository.save(studyDesignElementLibrary);
    }

}
