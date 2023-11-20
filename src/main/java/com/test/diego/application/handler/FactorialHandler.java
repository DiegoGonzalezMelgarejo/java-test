package com.test.diego.application.handler;

import com.test.diego.application.dto.FactorialDto;
import com.test.diego.application.usecase.FactorialUseCase;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Optional;

@Component
public class FactorialHandler {
    private final FactorialUseCase factorialUseCase;

    public FactorialHandler(FactorialUseCase factorialUseCase) {
        this.factorialUseCase = factorialUseCase;
    }
    public FactorialDto execute(int num){
        return Optional.of(factorialUseCase.calculateFactorial(num))
                .map(factorial -> FactorialDto.builder()
                        .factorial(factorial).build())
                .orElseThrow();
    }
}
