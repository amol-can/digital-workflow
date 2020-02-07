package com.atos.studybuilder.service;

import com.atos.studybuilder.model.Protocol;
import com.atos.studybuilder.repository.ProtocolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Protocol getProtocol(int id) throws Exception {
        return protocolRepository.findById(id)
                .orElseThrow(() -> new Exception());
    }

    //TODO to update the protocol
   /* public Protocol updateProtocol(int id){
        return protocolRepository.findById(id)
                .map(protocol -> {
                    protocol.setTitle(.getName());
                    employee.setRole(newEmployee.getRole());
                    return protocolRepository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return protocolRepository.save(newEmployee);
                });
    }*/
}
