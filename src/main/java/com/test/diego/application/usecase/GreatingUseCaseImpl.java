package com.test.diego.application.usecase;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

@AllArgsConstructor
@Component
public class GreatingUseCaseImpl implements GreatingUsecase{
    private static final String greating="Hola Bienvenido al equipo de desarrollo, tu pc se llama ";
    @Override
    public String greet() throws UnknownHostException {
        return greating.concat(InetAddress.getLocalHost().getHostName());
    }
}
