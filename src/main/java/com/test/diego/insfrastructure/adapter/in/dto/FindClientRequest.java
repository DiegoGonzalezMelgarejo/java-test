package com.test.diego.insfrastructure.adapter.in.dto;

import lombok.Getter;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Getter
public class FindClientRequest {
    @NotNull(message = "identificationCard cannot be null.")
    @NotEmpty(message = "identificationCard cannot be empty.")
    private String identificationCard;
    @NotNull(message = "identiFicationType cannot be null.")
    private IdentiFicationType identiFicationType;
}
