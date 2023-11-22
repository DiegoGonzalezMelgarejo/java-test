package com.test.diego.application.usecase;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@AllArgsConstructor
@Component
public class FactorialUseCaseImpl implements FactorialUseCase{
    private static final int VALUE_INITIAL=2;
    private static final List<Integer> BASIC_VALUES= Arrays.asList(0,1);
    @Override
    public BigInteger calculateFactorial(int num) {
        return  BASIC_VALUES.contains(num) ? BigInteger.ONE :
                checkNegativeNumber(num);
    }
    private BigInteger checkNegativeNumber(int num){
        return num < 0 ? BigInteger.valueOf(-1) :
                IntStream.rangeClosed(VALUE_INITIAL,num)
                        .mapToObj(BigInteger::valueOf)
                        .reduce(BigInteger.ONE,BigInteger::multiply);
    }
}
