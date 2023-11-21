package com.test.diego.application.usecase;

import com.test.diego.application.dto.ClientDto;
import com.test.diego.application.exception.ClientNotFountException;
import com.test.diego.application.usecase.mapper.ClientMapper;
import com.test.diego.insfrastructure.persistence.repository.ClientJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class FindClientUseCaseImpl implements FindClientUseCase {
    private final ClientJpaRepository clientJpaRepository;

    private static final String CLIENT_NOT_FOUND="Client not found";

    @Override
    public ClientDto findClient(String identification, String identificationType) {
        return clientJpaRepository.findByIdentificationCardAndIdentificationType(identification,identificationType)
                .map(ClientMapper::toDto)
                .orElseThrow(()->new ClientNotFountException(CLIENT_NOT_FOUND));
    }
}
