package com.atos.studybuilder.service;

import com.atos.studybuilder.model.Protocol;
import com.atos.studybuilder.repository.ProtocolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProtocolService {

    @Autowired
    ProtocolRepository protocolRepository;

    public void createProtocol(Protocol protocol){
        protocolRepository.save(protocol);
    }

    public List<Protocol> getProtocols(){
        List protocols = new ArrayList();
        protocolRepository.findAll().forEach(protocols::add);
        return protocols;
    }
}
