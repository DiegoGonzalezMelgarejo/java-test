package com.test.diego.application.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigInteger;

@Getter
@Builder
public class FactorialDto {
    private final BigInteger factorial;
}
