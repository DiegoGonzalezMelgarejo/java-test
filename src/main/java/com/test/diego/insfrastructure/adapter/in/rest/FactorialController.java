package com.test.diego.insfrastructure.adapter.in.rest;

import com.test.diego.application.dto.FactorialDto;
import com.test.diego.application.handler.FactorialHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController {

    private final FactorialHandler factorialHandler;

    public FactorialController(FactorialHandler factorialHandler) {
        this.factorialHandler = factorialHandler;
    }
    @PostMapping("/{numero}")
    public ResponseEntity<FactorialDto> calculateFactorial(@PathVariable int numero){
        return  ResponseEntity.ok(factorialHandler.execute(numero));
    }
}
