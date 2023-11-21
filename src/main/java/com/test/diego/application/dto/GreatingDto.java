package com.test.diego.application.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class GreatingDto {
    private final String message;
}
