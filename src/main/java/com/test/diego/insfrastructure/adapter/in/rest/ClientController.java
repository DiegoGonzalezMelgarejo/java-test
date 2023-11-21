package com.test.diego.insfrastructure.adapter.in.rest;

import com.test.diego.application.dto.ClientDto;
import com.test.diego.application.handler.FindClientHandler;
import com.test.diego.insfrastructure.adapter.in.dto.FindClientRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final FindClientHandler findClientHandler;


    public ClientController(FindClientHandler findClientHandler) {
        this.findClientHandler = findClientHandler;
    }
    @PostMapping(path = "",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ClientDto> findClient(@Valid @RequestBody FindClientRequest findClientRequest){
     return ResponseEntity.ok(findClientHandler.findClientDto(findClientRequest));
    }
}
