package com.test.diego.insfrastructure.adapter.in.rest.advice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
public class MessageAdviceDto {
    private final String message;
}
