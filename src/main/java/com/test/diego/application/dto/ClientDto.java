package com.test.diego.application.dto;

import lombok.Builder;
import lombok.Getter;

import javax.validation.Valid;

@Builder
@Getter
public class ClientDto {
    private final String identificationCard;
    private final String identificationType;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String secondName;
    private final String phone;
    private final String address;
    private final String city;
}
