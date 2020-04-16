package com.atos.studybuilder.service;

import com.atos.studybuilder.model.ProtocolLevelContent;
import com.atos.studybuilder.repository.ProtocolLevelContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProtocolLevelContentService {
    @Autowired
    ProtocolLevelContentRepository protocolLevelContentRepository;

    public List<ProtocolLevelContent> protocolLevelContentList(){
        List<ProtocolLevelContent> protocolLevelContents = new ArrayList<>();
        protocolLevelContentRepository.findAll().forEach(protocolLevelContents::add);
        return protocolLevelContents;
    }

    public boolean protocolLevelContentSave(ProtocolLevelContent protocolLevelContent) throws Exception {
        try {
            protocolLevelContentRepository.save(protocolLevelContent);
            return true;
        } catch (Exception e){
            System.out.println("Exception #ProtocolLevelContentSave "+ e.toString() );
            throw new Exception("API Exception while saving ProtocolLevelContent "+ e.getLocalizedMessage());
        }
    }

    public ProtocolLevelContent protocolLevelContentShow(String protocolId) throws Exception {
        return protocolLevelContentRepository.findById(protocolId)
                .orElseThrow(() -> new Exception("Given Protocol ID is not available"));
    }

    public void protocolLevelContentUpdate(ProtocolLevelContent protocolLevelContent){
        protocolLevelContentRepository.save(protocolLevelContent);
    }

    public boolean protocolLevelContentDelete(String protocolId){
        protocolLevelContentRepository.deleteById(protocolId);
        return true;
    }
    
    
}
