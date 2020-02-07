package com.atos.studybuilder.controller;

import com.atos.studybuilder.model.Protocol;
import com.atos.studybuilder.service.ProtocolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProtocolController {

    @Autowired
    ProtocolService protocolService;

    @RequestMapping(value = "/protocols", produces = {"application/json", "application/xml"})
    @ResponseBody
    public List<Protocol> listProtocols() {
        return protocolService.getProtocols();
    }

    @RequestMapping(value = "/protocols", method = RequestMethod.POST,
            produces = {"application/json", "application/xml"})
    public void addProtocol(@RequestBody Protocol protocol) {
        protocolService.createProtocol(protocol);
    }

    @RequestMapping("/protocols/{id}")
    public Protocol getprotocol(@PathVariable int id) throws Exception {
        return protocolService.getProtocol(id);
    }

    @PutMapping("/protocol/{id}")
    Protocol updateProtocol(@RequestBody Protocol protocol, @PathVariable int id){
        return null;
    }

}
