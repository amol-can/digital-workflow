package com.atos.studybuilder.controller;

import com.atos.studybuilder.model.ProtocolLevelContent;
import com.atos.studybuilder.service.ProtocolLevelContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/protocol-level")
public class ProtocolLevelContentController {
    @Autowired
    ProtocolLevelContentService protocolLevelContentService;

    @GetMapping
    List<ProtocolLevelContent> protocolLevelContentList(){
        return protocolLevelContentService.protocolLevelContentList();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    boolean protocolLevelContentList(@RequestBody ProtocolLevelContent ProtocolLevelContent) throws Exception {
        return protocolLevelContentService.protocolLevelContentSave(ProtocolLevelContent);
    }

    @DeleteMapping(value = "/{protocolId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    boolean protocolLevelContentDelete(@PathVariable String protocolId){
        return protocolLevelContentService.protocolLevelContentDelete(protocolId);
    }

    @GetMapping(value = "/{protocolId}")
    ProtocolLevelContent protocolLevelContentShow(@PathVariable String protocolId) throws Exception {
        return protocolLevelContentService.protocolLevelContentShow(protocolId);
    }

    @PutMapping(value = "/{protocolId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void protocolLevelContentUpdate(@RequestBody ProtocolLevelContent protocolLevelContent, @PathVariable String protocolId){
        protocolLevelContentService.protocolLevelContentUpdate(protocolLevelContent);
    }

}
