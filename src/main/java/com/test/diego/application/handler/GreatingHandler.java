package com.test.diego.application.handler;

import com.test.diego.application.dto.GreatingDto;
import com.test.diego.application.usecase.GreatingUsecase;
import org.springframework.stereotype.Component;

import java.net.UnknownHostException;
import java.util.Optional;
@Component
public class GreatingHandler {
    private final GreatingUsecase greatingUsecase;

    public GreatingHandler(GreatingUsecase greatingUsecase) {
        this.greatingUsecase = greatingUsecase;
    }

    public GreatingDto execute() throws UnknownHostException {
        return Optional.of(greatingUsecase.greet())
                .map(greating -> GreatingDto.builder()
                        .message(greating).build())
                .get();
    }
}
