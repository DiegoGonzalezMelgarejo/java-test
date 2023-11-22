package com.test.diego.infrastructure.in.rest;

import com.test.diego.application.dto.FactorialDto;
import com.test.diego.application.handler.FactorialHandler;
import com.test.diego.insfrastructure.adapter.in.rest.FactorialController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FactorialControllerTest {
    private FactorialHandler factorialHandler;
    private FactorialController factorialController;

    @BeforeEach
    public void initEach() {
        factorialHandler= mock(FactorialHandler.class);
        factorialController= new FactorialController(factorialHandler);
    }
    @Test
    void factorialSuccess(){
        FactorialDto factorialDto= FactorialDto.builder().factorial(BigInteger.ONE).build();
        when(factorialHandler.execute(1)).thenReturn(factorialDto);
        ResponseEntity<FactorialDto> response= factorialController.calculateFactorial(1);
        Assertions.assertEquals(1,response.getBody().getFactorial().intValue());
    }
}
