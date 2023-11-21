package com.test.diego.application.usecase;

import com.test.diego.application.dto.ClientDto;
import com.test.diego.insfrastructure.persistence.entity.Client;

public interface FindClientUseCase {
    public ClientDto findClient(String identification, String identificationType);
}
