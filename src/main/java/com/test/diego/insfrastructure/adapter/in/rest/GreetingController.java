package com.test.diego.insfrastructure.adapter.in.rest;

import com.test.diego.application.dto.GreatingDto;
import com.test.diego.application.handler.GreatingHandler;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@RestController
@RequestMapping("/hola")
public class GreetingController {
    public  final GreatingHandler greatingHandler;

    public GreetingController(GreatingHandler greatingHandler) {
        this.greatingHandler = greatingHandler;
    }

    @GetMapping(path = "",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<GreatingDto> greet() throws UnknownHostException {
        return ResponseEntity.ok(greatingHandler.execute());
    }
}
