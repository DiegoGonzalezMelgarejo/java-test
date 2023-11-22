package com.test.diego.application.handler;

import com.test.diego.application.dto.FactorialDto;
import com.test.diego.application.usecase.FactorialUseCaseImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class FactorialHandlerTest {

    private FactorialUseCaseImpl factorialUseCase;
    private FactorialHandler factorialHandler;
    @BeforeEach
    public void initEach() {
        factorialUseCase=mock(FactorialUseCaseImpl.class);
        factorialHandler= new FactorialHandler(factorialUseCase);
    }
    @Test
    void factorialSuccess(){
        when(factorialUseCase.calculateFactorial(1)).thenReturn(BigInteger.ONE);
        FactorialDto value= factorialHandler.execute(1);
        Assertions.assertEquals(1,value.getFactorial().intValue());
    }
}
