package com.test.diego.application.usecase;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.stream.IntStream;

@AllArgsConstructor
@Component
public class FactorialUseCaseImpl implements FactorialUseCase{
    private static final int VALUE_INITIAL=2;
    @Override
    public BigInteger calculateFactorial(int num) {
        return IntStream.rangeClosed(VALUE_INITIAL,num)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE,BigInteger::multiply);
    }
}
