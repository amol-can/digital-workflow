package com.atos.studybuilder.controller;

import com.atos.studybuilder.model.Protocol;
import com.atos.studybuilder.service.ProtocolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/protocols")
public class ProtocolController {

    @Autowired
    ProtocolService protocolService;

    @RequestMapping(value = "/", produces = {"application/json", "application/xml"})
    @ResponseBody
    public List<Protocol> getProtocols() {
        return protocolService.getProtocols();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST,
            produces = {"application/json", "application/xml"})
    public void addProtocol(@RequestBody Protocol protocol) {
        protocolService.createProtocol(protocol);
    }

}
