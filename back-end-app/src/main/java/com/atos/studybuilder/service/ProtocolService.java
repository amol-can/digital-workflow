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

    public void protocolCreate(Protocol protocol){
        protocolRepository.save(protocol);
    }

    public List<Protocol> protocolIndex(){
        List protocols = new ArrayList();
        protocolRepository.findAll().forEach(protocols::add);
        return protocols;
    }

    public Protocol protocolShow(int id) throws Exception {
        return protocolRepository.findById(id)
                .orElseThrow(() -> new Exception("protocol is not available"));
    }

    public void protocolUpdate(int id, Protocol protocol) {
        protocolRepository.save(protocol);
    }

    public void protocolDelete(int protocolId){
        protocolRepository.deleteById(protocolId);
    }

}
