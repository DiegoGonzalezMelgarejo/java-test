package com.test.diego.application.usecase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class FactorialUseCaseTest {

    private FactorialUseCaseImpl factorialUseCase;

    @BeforeEach
    public void initEach() {
        factorialUseCase= new FactorialUseCaseImpl();
    }

    @Test
    void factorialSuccess(){
        BigInteger factorial=factorialUseCase.calculateFactorial(4);
        Assertions.assertEquals(24,factorial.intValue());
    }

    @Test
    void factorialSuccessZero(){
        BigInteger factorial=factorialUseCase.calculateFactorial(0);
        Assertions.assertEquals(1,factorial.intValue());
    }
    @Test
    void factorialSuccessOne(){
        BigInteger factorial=factorialUseCase.calculateFactorial(1);
        Assertions.assertEquals(1,factorial.intValue());
    }
    @Test
    void factorialNegativeOrNoValid(){
        BigInteger factorial=factorialUseCase.calculateFactorial(-4);
        Assertions.assertEquals(-1,factorial.intValue());
    }
}
