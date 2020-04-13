package com.atos.studybuilder.repository;

import com.atos.studybuilder.model.SDELibraryRelationship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SDELibraryRelationshipRepository extends JpaRepository<SDELibraryRelationship, Integer> {
    List<SDELibraryRelationship> findByElementType(String elementType);
}
