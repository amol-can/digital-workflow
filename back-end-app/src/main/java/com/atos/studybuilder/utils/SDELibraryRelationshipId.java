package com.atos.studybuilder.utils;

import java.io.Serializable;
import java.util.Objects;

public class SDELibraryRelationshipId implements Serializable {
    private String elementType;
    private String elementType2;

    public SDELibraryRelationshipId(){}

    public SDELibraryRelationshipId(String elementType, String elementType2) {
        this.elementType = elementType;
        this.elementType2 = elementType2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SDELibraryRelationshipId that = (SDELibraryRelationshipId) o;
        return elementType.equals(that.elementType) &&
                elementType2.equals(that.elementType2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elementType, elementType2);
    }
}
