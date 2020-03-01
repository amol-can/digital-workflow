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

    @GetMapping(produces = {"application/json", "application/xml"})
    @ResponseBody
    List<Protocol> protocolIndex() {
        return protocolService.protocolIndex();
    }

    @PostMapping(produces = {"application/json", "application/xml"})
    void protocolCreate(@RequestBody Protocol protocol) {
        protocolService.protocolCreate(protocol);
    }

    @GetMapping("/{id}")
    Protocol protocolShow(@PathVariable int id) throws Exception {
        return protocolService.protocolShow(id);
    }

    @PutMapping("/{id}")
    void protocolUpdate(@RequestBody Protocol protocol, @PathVariable int id) {
        protocolService.protocolUpdate(id,protocol);
    }

    @DeleteMapping("/{id}")
    void protocolDelete(@PathVariable int id){
        protocolService.protocolDelete(id);
    }

}
