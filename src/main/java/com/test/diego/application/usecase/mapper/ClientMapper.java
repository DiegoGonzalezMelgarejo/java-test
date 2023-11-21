package com.test.diego.application.usecase.mapper;

import com.test.diego.application.dto.ClientDto;
import com.test.diego.insfrastructure.persistence.entity.Client;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ClientMapper {
    public static ClientDto toDto(Client client){
        return ClientDto.builder()
                .city(client.getCity())
                .phone(client.getPhone())
                .address(client.getAddress())
                .lastName(client.getLastName())
                .middleName(client.getMiddleName())
                .firstName(client.getFirstName())
                .identificationCard(client.getIdentificationCard())
                .identificationType(client.getIdentificationType())
                .secondName(client.getSecondSurName())
                .build();
    }
}
