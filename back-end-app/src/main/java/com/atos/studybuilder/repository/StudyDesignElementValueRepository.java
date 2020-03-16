package com.atos.studybuilder.repository;

import com.atos.studybuilder.model.StudyDesignElementValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface StudyDesignElementValueRepository extends JpaRepository<StudyDesignElementValue,Integer> {

    List<StudyDesignElementValue> findByStudyDesignElement(String studyDesignElement);
}
