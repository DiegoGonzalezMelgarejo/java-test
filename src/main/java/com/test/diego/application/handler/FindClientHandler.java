package com.test.diego.application.handler;

import com.test.diego.application.dto.ClientDto;
import com.test.diego.application.usecase.FindClientUseCase;
import com.test.diego.insfrastructure.adapter.in.dto.FindClientRequest;
import org.springframework.stereotype.Component;

@Component
public class FindClientHandler {
    private final FindClientUseCase findClientUseCase;

    public FindClientHandler(FindClientUseCase findClientUseCase) {
        this.findClientUseCase = findClientUseCase;
    }

    public ClientDto findClientDto(FindClientRequest clientRequest){
        return findClientUseCase.findClient(clientRequest.getIdentificationCard(),
                clientRequest.getIdentiFicationType().getName());
    }
}
