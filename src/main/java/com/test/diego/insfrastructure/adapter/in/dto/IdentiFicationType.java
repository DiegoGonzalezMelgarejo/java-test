package com.test.diego.insfrastructure.adapter.in.dto;

import lombok.Getter;

@Getter
public enum IdentiFicationType {
    C("cedula_de_ciudadania"),P("pasaporte");
    private String name;

    IdentiFicationType(String name) {
        this.name = name;
    }
}
